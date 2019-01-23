package com.huazai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

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
@EnableZuulProxy
public class MicroserviceZuulApp_6001
{

	public static void main(String[] args)
	{
		SpringApplication.run(MicroserviceZuulApp_6001.class, args);
	}
}