package com.huazai.springcloud.config;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 
 * @author HuaZai
 * @contact who.seek.me@java98k.vip
 *          <ul>
 * @description 测试 Spring Cloud Config 客户端配置
 *              </ul>
 * @className ClientConfigTest
 * @package com.huazai.springcloud.config
 * @createdTime 2019年1月31日 下午6:04:57
 *
 * @version V1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientConfigTest
{
	/**
	 * 应用名称
	 */
	@Value("${spring.application.name}")
	private String applicationName;

	/**
	 * 当前使用环境
	 */
	@Value("${spring.profiles}")
	private String env;
	
	/**
	 * 端口号
	 */
	@Value("${server.port}")
	private String port;
	
	/**
	 * 使用的那台 eureka 服务器
	 */
	@Value("${eureka.client.service-url.defaultZone}")
	private String eurekaService;
	
	@Test
	public void testConfig() {
		Map<String, String> map = new HashMap<>();
		map.put("applicationName", applicationName);
		map.put("env", env);
		map.put("port", port);
		map.put("eurekaService", eurekaService);
		
		System.out.println(Arrays.asList(map));
	}
	
	
	
	
}
