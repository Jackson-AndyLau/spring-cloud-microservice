package com.huazai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 
 * @author HuaZai
 * @contact who.seek.me@java98k.vip
 *          <ul>
 * @description
 *              <li>服务提供者1号服务器
 *              </ul>
 * @className MicroserviceProviderApp_8001
 * @package com.huazai.springcloud
 * @createdTime 2018年05月06日 下午2:21:44
 *
 * @version V1.0.0
 */
@SpringBootApplication
@EnableEurekaClient // 本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient // 开启服务发现
public class MicroserviceProviderApp_8001
{

	public static void main(String[] args)
	{
		SpringApplication.run(MicroserviceProviderApp_8001.class, args);
	}
}
