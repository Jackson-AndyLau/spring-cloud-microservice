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
 *              <li> Eureka Server 服务器端启动类,接受其它微服务注册进来
 *              </ul>
 * @className MicroserviceConfigEurekaClient_7001
 * @package com.huazai.springcloud
 * @createdTime 2018年10月5日 下午5:52:07
 *
 * @version V1.0.0
 */
@SpringBootApplication
@EnableEurekaServer
public class MicroserviceConfigEurekaApp_7001
{
	public static void main(String[] args)
	{
		SpringApplication.run(MicroserviceConfigEurekaApp_7001.class, args);
	}
}
