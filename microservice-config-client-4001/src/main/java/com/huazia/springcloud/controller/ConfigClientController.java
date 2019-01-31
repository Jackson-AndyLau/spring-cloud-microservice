package com.huazia.springcloud.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author HuaZai
 * @contact who.seek.me@java98k.vip
 *          <ul>
 * @description TODO
 *              </ul>
 * @className ConfigClientController
 * @package com.huazia.springcloud
 * @createdTime 2019年1月31日 下午7:06:38
 *
 * @version V1.0.0
 */
@RestController
@RequestMapping("/config/client")
public class ConfigClientController
{
	/**
	 * 应用名称
	 */
	@Value("${spring.application.name}")
	private String applicationName;

	/**
	 * 当前使用环境
	 */
/*	@Value("${spring.profiles}")
	private String env;*/
	
	/**
	 * 端口号
	 */
//	@Value("${server.port}")
//	private String port;
	
	/**
	 * 使用的那台 eureka 服务器
	 */
//	@Value("${eureka.client.service-url.defaultZone}")
//	private String eurekaService;
	
	@RequestMapping("/getInfo")
	public Map<String, String> getConfigInfo(){
		Map<String, String> map = new HashMap<>();
		map.put("applicationName", applicationName);
//		map.put("env", env);
//		map.put("port", port);
//		map.put("eurekaService", eurekaService);
		
		return map;
	}
}
