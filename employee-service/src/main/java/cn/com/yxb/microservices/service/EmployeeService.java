package cn.com.yxb.microservices.service;

import cn.com.yxb.microservices.model.Employee;

import java.util.List;

/**
 * Created on 2017/9/23.
 *
 * @author frank.
 */
public interface EmployeeService {

    List<Employee> findEmployeeByDepartmentId(Long id);

    Employee findById(Long id);

    List<Employee> findByEmployeeName(String employeeName);
}
