package com.huazai.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huazai.springcloud.dao.DepartmentDao;
import com.huazai.springcloud.entity.Department;
import com.huazai.springcloud.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService
{

	@Autowired
	private DepartmentDao departmentDao;

	@Override
	public boolean add(Department department)
	{
		return departmentDao.addDepartment(department);
	}

	@Override
	public Department get(Long id)
	{
		return departmentDao.findById(id);
	}

	@Override
	public List<Department> list()
	{
		return departmentDao.findAll();
	}

}
