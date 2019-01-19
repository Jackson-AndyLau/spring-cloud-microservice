package com.huazai.springcloud.factory;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.huazai.springcloud.entity.Department;
import com.huazai.springcloud.service.DepartmentClientService;

import feign.hystrix.FallbackFactory;

/**
 * 
 * @author HuaZai
 * @contact who.seek.me@java98k.vip
 *          <ul>
 * @description TODO
 *              </ul>
 *              
 * @className DepartmentClientServiceFallbackFactory
 * @package com.huazai.springcloud.factory
 * @createdTime 2019年1月14日 下午7:48:16
 *
 * @version V1.0.0
 */
@Component
public class DepartmentClientServiceFallbackFactory implements FallbackFactory<DepartmentClientService>
{

	@Override
	public DepartmentClientService create(Throwable cause)
	{
		return new DepartmentClientService()
		{

			@Override
			public void update(Department department)
			{
				// TODO Auto-generated method stub

			}

			@Override
			public List<Department> list()
			{
				List<Department> departments = new ArrayList<>();
				Department department = new Department("部门信息异常，无部门信息");
				departments.add(department);
				return departments;
			}

			@Override
			public Department get(Long id)
			{
				Department department = new Department(id + "号的部门信息不存在");
				return department;
			}

			@Override
			public void delete(Long id)
			{
				// TODO Auto-generated method stub

			}

			@Override
			public boolean add(Department department)
			{
				// TODO Auto-generated method stub
				return false;
			}
		};
	}

}
