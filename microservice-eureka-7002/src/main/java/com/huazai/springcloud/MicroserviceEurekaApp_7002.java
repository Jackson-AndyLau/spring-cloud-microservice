package com.huazai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * <p>
 * 
 * @ClassName : MicroserviceEurekaApp
 *            </p>
 *            <p>
 * @Description : TODO
 *              </p>
 * 
 * @Author : HuaZai
 * @ContactInformation : who.seek.me@java98k.vip
 * @Date : 2018年12月23日 下午9:02:12
 * @Version : V1.0.0
 * 
 * @param
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
