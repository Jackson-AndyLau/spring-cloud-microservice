package com.huazai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author HuaZai
 * @contact who.seek.me@java98k.vip
 *          <ul>
 * @description
 *              <li>服务消费者
 *              </ul>
 * @className MicroServiceConsumerApp
 * @package com.huazai.springcloud
 * @createdTime 2018年05月22日 下午3:47:02
 *
 * @version V1.0.0
 */
@SpringBootApplication
//@EnableEurekaClient
public class MicroServiceConsumerApp
{

	public static void main(String[] args)
	{
		SpringApplication.run(MicroServiceConsumerApp.class, args);
	}
}
