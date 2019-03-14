package com.huazai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.huazai.springcloud.cfgbeans.ConfigBean;
import com.huazai.springcloud.cfgbeans.IRuleConfig;

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
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICE-PROVIDER", configuration = IRuleConfig.class) // MICROSERVICE-PROVIDER 应用名称
public class MicroServiceConsumerApp
{

	public static void main(String[] args)
	{
		SpringApplication.run(MicroServiceConsumerApp.class, args);
	}
}
