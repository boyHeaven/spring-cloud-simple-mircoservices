package cn.com.yxb.microservices.service;

import cn.com.yxb.microservices.model.DepartAndEmplComposite;
import cn.com.yxb.microservices.model.Employee;

import java.util.List;

/**
 * Created on 2017/9/23.
 *
 * @author frank.
 */
public interface CompositeService {

    DepartAndEmplComposite findCompositeByDepartmentName(String name);

    List<Employee> findCompositeEmployeeByName(String name);


}
