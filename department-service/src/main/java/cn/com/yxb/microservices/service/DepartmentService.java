package cn.com.yxb.microservices.service;

import cn.com.yxb.microservices.model.Department;

/**
 * Created on 2017/9/23.
 *
 * @author frank.
 */
public interface DepartmentService {

    Department findByDepartmentName(String name);
}
