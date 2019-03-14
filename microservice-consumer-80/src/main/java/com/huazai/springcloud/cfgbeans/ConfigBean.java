package com.huazai.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.WeightedResponseTimeRule;

/**
 * 
 * <p>
 * 
 * @ClassName : ConfigBean
 *            </p>
 *            <p>
 * @Description : TODO
 *              </p>
 * 
 * @Author : HuaZai
 * @ContactInformation : who.seek.me@java98k.vip
 * @Date : 2018年05月23日 下午9:01:21
 * @Version : V1.0.0
 * 
 * @param
 */
@Configuration
public class ConfigBean // spring boot 中的 @Configuration + ConfigBean ==> Spring 的配置文件
						// applicationContext.xml
{
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}

//	@Bean
//	public IRule myIRule()
//	{
//		// return new RetryRule();
//		// return new RandomRule();
//		// return new BestAvailableRule();
//		// return new ZoneAvoidanceRule();
//		// return new AvailabilityFilteringRule();
//		return new WeightedResponseTimeRule();
//	}

}
