package com.huazai.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public boolean add(@RequestBody Department department)
	{
		return departmentService.add(department);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Long id)
	{

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

}
