package com.huazai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * @author HuaZai
 * @contact who.seek.me@java98k.vip
 *          <ul>
 * @description
 *              <li>Eureka 注册中心2号服务器
 *              </ul>
 * @className MicroserviceEurekaApp_7002
 * @package com.huazai.springcloud
 * @createdTime 2018年12月23日 下午4:45:44
 *
 * @version V1.0.0
 */
@SpringBootApplication
@EnableEurekaServer // 表示 EurekaServer 服务器端启动类,并接受其它微服务注册进来
public class MicroserviceEurekaApp_7002
{
	public static void main(String[] args)
	{
		SpringApplication.run(MicroserviceEurekaApp_7002.class, args);
	}
}
