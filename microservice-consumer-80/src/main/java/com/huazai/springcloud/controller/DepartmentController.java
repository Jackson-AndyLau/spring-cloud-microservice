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

	private static final String BASE_URL_PREFIX = "http://localhost:8001/department";

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public boolean add(@RequestBody Department department)
	{
		return restTemplate.postForObject(BASE_URL_PREFIX + "/add", department, Boolean.class);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Long id)
	{
		restTemplate.delete(BASE_URL_PREFIX + "/delete/" + id, id);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public void update(@RequestBody Department department)
	{
		restTemplate.put(BASE_URL_PREFIX + "/update", department, Department.class);
		;
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Department get(@PathVariable Long id)
	{
		return restTemplate.getForObject(BASE_URL_PREFIX + "/get/" + id, Department.class);
	}

	@RequestMapping(value = "/list")
	public List<Department> list()
	{
		return restTemplate.getForObject(BASE_URL_PREFIX + "/list", List.class);
	}
}
