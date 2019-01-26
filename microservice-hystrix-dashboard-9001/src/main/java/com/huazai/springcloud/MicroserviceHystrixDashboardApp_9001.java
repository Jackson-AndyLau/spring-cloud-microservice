package com.huazai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 
 * @author HuaZai
 * @contact who.seek.me@java98k.vip
 *          <ul>
 * @description
 *              <li>微服务监控服务器
 *              </ul>
 * @className MicroserviceHystrixDashboardApp_9001
 * @package com.huazai.springcloud
 * @createdTime 2018年5月26日 下午4:42:43
 *
 * @version V1.0.0
 */
@SpringBootApplication
@EnableHystrixDashboard // 开启服务调用监控
public class MicroserviceHystrixDashboardApp_9001
{
	public static void main(String[] args)
	{
		SpringApplication.run(MicroserviceHystrixDashboardApp_9001.class, args);
	}
}
