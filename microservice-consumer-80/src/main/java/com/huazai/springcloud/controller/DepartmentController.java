package com.huazai.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.huazai.springcloud.entity.Department;

/**
 * 
 * <p>
 * 
 * @ClassName : DepartmentController
 *            </p>
 *            <p>
 * @Description : TODO
 *              </p>
 * 
 * @Author : HuaZai
 * @ContactInformation : who.seek.me@java98k.vip
 * @Date : 2018年12月23日 下午9:01:38
 * @Version : V1.0.0
 * 
 * @param
 */
@SuppressWarnings("unchecked")
@RestController
@RequestMapping("/department")
public class DepartmentController
{

	/**
	 * 初级 -> 通过 Spring 的 RestTemplate + 服务提供者地址进行访问
	 */
	private static final String BASE_URL_PREFIX = "http://localhost:8001/department";
	/**
	 * 终极 -> 通过 Spring 的 RestTemplate + Eureka 注册中心服务列表的提供者应用名称进行访问
	 * （Ribbon和Eureka整合后Consumer可以直接调用服务而不用再关心地址和端口号）
	 */
	private static final String BASE_APPLICATION_URL_PREFIX = "http://MICROSERVICE-PROVIDER/department";

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public boolean add(@RequestBody Department department)
	{
		return restTemplate.postForObject(BASE_APPLICATION_URL_PREFIX + "/add", department, Boolean.class);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Long id)
	{
		restTemplate.delete(BASE_APPLICATION_URL_PREFIX + "/delete/" + id, id);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public void update(@RequestBody Department department)
	{
		restTemplate.put(BASE_APPLICATION_URL_PREFIX + "/update", department, Department.class);
		;
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Department get(@PathVariable Long id)
	{
		return restTemplate.getForObject(BASE_APPLICATION_URL_PREFIX + "/get/" + id, Department.class);
	}

	@RequestMapping(value = "/list")
	public List<Department> list()
	{
		return restTemplate.getForObject(BASE_APPLICATION_URL_PREFIX + "/list", List.class);
	}
}
