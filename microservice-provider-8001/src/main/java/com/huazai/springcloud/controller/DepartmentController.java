package com.huazai.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.huazai.springcloud.entity.Department;
import com.huazai.springcloud.service.DepartmentService;

@RestController
@RequestMapping(value = "/department")
public class DepartmentController
{

	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public boolean add(@RequestBody Department department)
	{
		// Department department = new Department(name);
		return departmentService.add(department);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Long id)
	{
		System.out.println(id);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public void update(@RequestBody Department department)
	{

	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Department get(@PathVariable Long id)
	{
		return departmentService.get(id);
	}

	@RequestMapping(value = "/list")
	public List<Department> list()
	{
		return departmentService.list();
	}

	@RequestMapping(value = "/getDiscoverList", method = RequestMethod.GET)
	public Object getDiscoverList()
	{
		// 发现服务列表
		List<String> list = discoveryClient.getServices();
		list.stream().forEach(item -> System.out.println(item));

		// 输出服务的详细信息
		List<ServiceInstance> instances = discoveryClient.getInstances("MICROSERVICE-PROVIDER");
		instances.stream().forEach(inst -> System.out.println("serviceId:" + inst.getServiceId() + ",host:"
				+ inst.getHost() + ",port:" + inst.getPort() + ",uri:" + inst.getUri()));

		return discoveryClient;
	}

}
