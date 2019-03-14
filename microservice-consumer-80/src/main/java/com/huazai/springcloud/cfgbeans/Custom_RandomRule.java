package com.huazai.springcloud.cfgbeans;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

/**
 * 
 * @author HuaZai
 * @contact who.seek.me@java98k.vip
 *          <ul>
 * @description
 *              <li>自定义轮询机制
 *              </ul>
 * @className Custom_RandomRule
 * @package com.huazai.springcloud.cfgbeans
 * @createdTime 2018年05月24日 下午4:49:51
 *
 * @version V1.0.0
 */
@SuppressWarnings("unused")
public class Custom_RandomRule extends AbstractLoadBalancerRule
{
	private AtomicInteger nextServerCyclicCounter;
	private static final boolean AVAILABLE_ONLY_SERVERS = true;
	private static final boolean ALL_SERVERS = false;

	private int total = 0; // 总的被调用次数
	private int currentIndex = 0;// 当前提供服务的机器号

	private static Logger log = LoggerFactory.getLogger(Custom_RandomRule.class);

	public Server choose(ILoadBalancer lb, Object key)
	{
		if (lb == null)
		{
			log.warn("no load balancer");
			return null;
		}

		Server server = null;

		while (server == null)
		{
			if (Thread.interrupted())
			{
				return null;
			}

			List<Server> reachableServers = lb.getReachableServers();
			List<Server> allServers = lb.getAllServers();
			int upCount = reachableServers.size();
			int serverCount = allServers.size();

			if ((upCount == 0) || (serverCount == 0))
			{
				log.warn("No up servers available from load balancer: " + lb);
				return null;
			}

			// 实现每台服务请求三次的业务逻辑
			if (total < 3)
			{
				server = reachableServers.get(currentIndex);
				total++;
			} else
			{
				total = 0;
				currentIndex++;
				if (currentIndex >= upCount)
				{
					currentIndex = 0;
				}
			}

			if (server == null)
			{
				/* Transient. */
				Thread.yield();
				continue;
			}

			if (server.isAlive() && (server.isReadyToServe()))
			{
				return (server);
			}

			// Next.
			server = null;
			Thread.yield();
		}
		return server;
	}

	@Override
	public Server choose(Object key)
	{
		return choose(getLoadBalancer(), key);
	}

	@Override
	public void initWithNiwsConfig(IClientConfig clientConfig)
	{
		// TODO Auto-generated method stub

	}

}
