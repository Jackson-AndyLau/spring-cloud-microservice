package com.huazai.springcloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

/**
 * 
 * @author HuaZai
 * @contact who.seek.me@java98k.vip
 *          <ul>
 * @description 自定义访问策略
 *              </ul>
 * @className IRuleConfig
 * @package com.huazai.springcloud.cfgbeans
 * @createdTime 2018年05月23日 下午3:57:31
 *
 * @version V1.0.0
 */
@Configuration
public class IRuleConfig
{
	@Bean
	public IRule myIRule()
	{
		// return new RetryRule();
		// return new RandomRule();
		// return new RoundRobinRule();
		// return new BestAvailableRule();
		// return new ZoneAvoidanceRule();
		// return new AvailabilityFilteringRule();
		// return new WeightedResponseTimeRule();
		return new Custom_RandomRule(); // 自定义算法
	}
}
