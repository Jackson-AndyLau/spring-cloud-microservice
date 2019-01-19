package com.huazai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 
 * @author HuaZai
 * @contact who.seek.me@java98k.vip
 *          <ul>
 * @description 
 *              <li>服务提供者服务器一
 *              </ul>
 * @className MicroserviceProviderApp
 * @package com.huazai.springcloud
 * @createdTime 2019年1月6日 下午2:21:44
 *
 * @version V1.0.0
 */
@SpringBootApplication
@EnableEurekaClient // 本服务启动后会自动注册进eureka服务中
public class MicroserviceProviderApp_8003
{

	public static void main(String[] args)
	{
		SpringApplication.run(MicroserviceProviderApp_8003.class, args);
	}
}
