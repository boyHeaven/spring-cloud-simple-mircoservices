package cn.com.yxb.microservices.service;

import cn.com.yxb.microservices.model.Employee;
import cn.com.yxb.microservices.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

/**
 * Created on 2017/9/23.
 *
 * @author frank.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findEmployeeByDepartmentId(Long id) {
        Assert.notNull(id, "department id is null");

        return employeeRepository.findByDepartmentId(id);
    }

    @Override
    public Employee findById(Long id) {
        return null;
    }

    @Override
    public List<Employee> findByEmployeeName(String employeeName) {
        return null;
    }
}
