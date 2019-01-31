package com.huazai.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.huazai.springcloud.entity.Department;
import com.huazai.springcloud.service.DepartmentClientService;

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
@RestController
@RequestMapping("/department")
public class DepartmentController
{

	@Autowired
	private DepartmentClientService deptClientService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public boolean add(@RequestBody Department department)
	{
		return this.deptClientService.add(department);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value = "id") Long id)
	{
		this.deptClientService.delete(id);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public void update(@RequestBody Department department)
	{
		this.deptClientService.update(department);
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Department get(@PathVariable(value = "id") Long id)
	{
		return this.deptClientService.get(id);
	}

	@RequestMapping(value = "/list")
	public List<Department> list()
	{
		return this.deptClientService.list();
	}
}