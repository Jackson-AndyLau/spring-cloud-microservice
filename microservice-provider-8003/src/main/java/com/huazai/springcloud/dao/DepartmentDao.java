package com.huazai.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.huazai.springcloud.entity.Department;

@Mapper
public interface DepartmentDao
{
	public boolean addDepartment(Department department);

	public Department findById(Long id);

	public List<Department> findAll();

}
