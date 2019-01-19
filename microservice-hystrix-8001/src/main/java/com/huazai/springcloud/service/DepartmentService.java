package com.huazai.springcloud.service;

import java.util.List;

import com.huazai.springcloud.entity.Department;

public interface DepartmentService
{
	public boolean add(Department department);
	
	public void delete(Long id);
	
	public void update(Department department);

	public Department get(Long id);

	public List<Department> list();
}
