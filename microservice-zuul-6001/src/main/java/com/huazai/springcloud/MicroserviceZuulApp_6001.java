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
 *              <li>zuul 路由网关
 *              </ul>
 * @className MicroserviceZuulApp_6001
 * @package com.huazai.springcloud
 * @createdTime 2018年06月06日 下午2:21:44
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
