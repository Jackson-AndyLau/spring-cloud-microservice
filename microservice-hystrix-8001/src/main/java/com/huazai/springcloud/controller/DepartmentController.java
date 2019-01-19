package com.huazai.springcloud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.huazai.springcloud.entity.Department;
import com.huazai.springcloud.service.DepartmentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping(value = "/department")
@SuppressWarnings("unused")
public class DepartmentController
{

	@Autowired
	private DepartmentService departmentService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@HystrixCommand(fallbackMethod = "processHystrix_add")
	public boolean add(@RequestBody Department department)
	{
		boolean result = departmentService.add(department);
		if (!result)
		{
			throw new RuntimeException(department.toString() + "/n---添加异常");
		}
		return result;
	}

	private boolean processHystrix_add(@RequestBody Department department)
	{
		return false;
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	@HystrixCommand(fallbackMethod = "processHystrix_delete")
	public void delete(@PathVariable Long id)
	{
		departmentService.delete(id);
	}

	private void processHystrix_delete(@PathVariable Long id)
	{
		System.out.println(id + "删除异常");
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	@HystrixCommand(fallbackMethod = "processHystrix_update")
	public void update(@RequestBody Department department)
	{
		departmentService.update(department);
	}

	private void processHystrix_update(@RequestBody Department department)
	{
		System.out.println(department.toString());
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	@HystrixCommand(fallbackMethod = "processHystrix_get")
	public Department get(@PathVariable Long id)
	{
		Department department = departmentService.get(id);
		if (department == null)
		{
			throw new RuntimeException(id + "号的部门信息不存在");
		}
		return department;
	}

	private Department processHystrix_get(@PathVariable Long id)
	{
		// Department department = new Department(id, id + "号的部门信息不存在", "not this data in the MySQL");
		Department department = new Department(id + "号的部门信息不存在");
		return department;
	}

	@RequestMapping(value = "/list")
	@HystrixCommand(fallbackMethod = "processHystrix_list")
	public List<Department> list()
	{
		List<Department> departments = departmentService.list();
		if (departments.size() == 0)
		{
			throw new RuntimeException("部门信息获取异常");
		}
		return departments;
	}

	private List<Department> processHystrix_list()
	{
		List<Department> departments = new ArrayList<>();
		// Department department = new Department(id, id + "号的部门信息不存在", "not this data
		// in the MySQL");
		Department department = new Department("部门信息异常，无部门信息");
		departments.add(department);

		return departments;
	}

}
