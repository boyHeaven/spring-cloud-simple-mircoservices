package cn.com.yxb.microservices.controller;

import cn.com.yxb.microservices.model.Employee;
import cn.com.yxb.microservices.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created on 2017/9/23.
 *
 * @author frank.
 */
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/findEmployeeByDepartmentId/{departmentId}")
    public List<Employee> findEmployeeByDepartmentId(@PathVariable(value = "departmentId") Long id) {

        return employeeService.findEmployeeByDepartmentId(id);

    }

    @GetMapping(value = "/findEmployeeByName/{name}")
    List<Employee> findEmployeeByName(@PathVariable(value = "name") String name){

        return employeeService.findByEmployeeName(name);
    }

}
