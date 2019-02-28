package com.huazai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 
 * @author HuaZai
 * @contact who.seek.me@java98k.vip
 *          <ul>
 * @description
 *              <li>Hystrix 熔断器
 *              </ul>
 * @className MicroserviceHystrixApp_8001
 * @package com.huazai.springcloud
 * @createdTime 2018年05月06日 下午2:21:44
 *
 * @version V1.0.0
 */
@SpringBootApplication
@EnableEurekaClient // 本服务启动后会自动注册进eureka服务中
@EnableCircuitBreaker // 开启对hystrixR熔断机制的支持
public class MicroserviceHystrixApp_8001
{

	public static void main(String[] args)
	{
		SpringApplication.run(MicroserviceHystrixApp_8001.class, args);
	}
}
