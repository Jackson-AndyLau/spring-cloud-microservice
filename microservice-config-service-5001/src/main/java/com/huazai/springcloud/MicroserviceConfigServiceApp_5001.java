package com.huazai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 
 * @author HuaZai
 * @contact who.seek.me@java98k.vip
 *          <ul>
 * @description
 *              <li>SpringCloudConfig服务端
 *              </ul>
 * @className MicroserviceConfigServiceApp_5001
 * @package com.huazai.springcloud
 * @createdTime 2018年05月06日 下午5:24:36
 *
 * @version V1.0.0
 */
@SpringBootApplication
@EnableConfigServer
public class MicroserviceConfigServiceApp_5001
{

	public static void main(String[] args)
	{
		SpringApplication.run(MicroserviceConfigServiceApp_5001.class, args);
	}
}
