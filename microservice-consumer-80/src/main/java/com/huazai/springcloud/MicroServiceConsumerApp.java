package com.huazai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 
 * <p>
 * 
 * @ClassName : MicroServiceConsumerApp
 *            </p>
 *            <p>
 * @Description : TODO
 *              </p>
 * 
 * @Author : HuaZai
 * @ContactInformation : who.seek.me@java98k.vip
 * @Date : 2018年12月23日 下午8:49:56
 * @Version : V1.0.0
 * 
 * @param
 */
@SpringBootApplication
@EnableEurekaClient
public class MicroServiceConsumerApp
{

	public static void main(String[] args)
	{
		SpringApplication.run(MicroServiceConsumerApp.class, args);
	}
}
