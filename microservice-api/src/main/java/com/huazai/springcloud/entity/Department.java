package com.huazai.springcloud.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 
 * <p>
 * 
 * @ClassName : Department
 *            </p>
 *            <p>
 * @Description : TODO
 *              </p>
 * 
 * @Author : HuaZai
 * @ContactInformation : who.seek.me@java98k.vip
 * @Date : 2018年05月23日 下午9:00:12
 * @Version : V1.0.0
 * 
 * @param
 */
@SuppressWarnings("unused")
@Accessors(chain = true)
// @AllArgsConstructor
@NoArgsConstructor

@Data
public class Department implements Serializable // 序列化
{
	/**
	 * @Files serialVersionUID : TODO
	 */
	private static final long serialVersionUID = -1362631725686764212L;
	private Long deptno; // 主键
	private String dname; // 部门名称
	private String db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

	public Department(String dname)
	{
		super();
		this.dname = dname;
	}

}
