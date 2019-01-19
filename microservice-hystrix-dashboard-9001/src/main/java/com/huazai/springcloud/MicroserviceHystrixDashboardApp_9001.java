package com.huazai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

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
@EnableHystrixDashboard // 开启服务调用监控
public class MicroserviceHystrixDashboardApp_9001
{
	public static void main(String[] args)
	{
		SpringApplication.run(MicroserviceHystrixDashboardApp_9001.class, args);
	}
}
