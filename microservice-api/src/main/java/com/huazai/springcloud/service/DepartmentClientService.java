package com.huazai.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.huazai.springcloud.entity.Department;
import com.huazai.springcloud.factory.DepartmentClientServiceFallbackFactory;

/**
 * 
 * @author HuaZai
 * @contact who.seek.me@java98k.vip
 *          <ul>
 * @description TODO
 *              </ul>
 * @className DepartmentClientService
 * @package com.huazai.springcloud.service
 * @createdTime 2018年05月13日 下午8:21:01
 *
 * @version V1.0.0
 */
// @FeignClient(value = "MICROSERVICE-PROVIDER/department")
@FeignClient(value = "MICROSERVICE-PROVIDER/department", fallbackFactory = DepartmentClientServiceFallbackFactory.class) // 添加
																															// Fallback，实现服务降级
public interface DepartmentClientService
{

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public boolean add(@RequestBody Department department);

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value = "id") Long id);

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public void update(@RequestBody Department department);

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Department get(@PathVariable(value = "id") Long id);

	@RequestMapping(value = "/list")
	public List<Department> list();
}
