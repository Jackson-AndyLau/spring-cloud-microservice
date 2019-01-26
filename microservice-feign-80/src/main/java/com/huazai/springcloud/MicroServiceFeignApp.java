package com.huazai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * @author HuaZai
 * @contact who.seek.me@java98k.vip
 *          <ul>
 * @description
 *              <li>Feign 负载均衡器
 *              </ul>
 * @className MicroServiceFeignApp
 * @package com.huazai.springcloud
 * @createdTime 2018年5月26日 下午4:44:03
 *
 * @version V1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages =
{ "com.huazai.springcloud" })
@ComponentScan("com.huazai.springcloud")
public class MicroServiceFeignApp
{

	public static void main(String[] args)
	{
		SpringApplication.run(MicroServiceFeignApp.class, args);
	}
}
