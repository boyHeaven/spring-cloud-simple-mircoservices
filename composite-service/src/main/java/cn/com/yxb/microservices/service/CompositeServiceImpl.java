package cn.com.yxb.microservices.service;

import cn.com.yxb.microservices.client.DepartmentClient;
import cn.com.yxb.microservices.client.EmployeeClient;
import cn.com.yxb.microservices.model.DepartAndEmplComposite;
import cn.com.yxb.microservices.model.Department;
import cn.com.yxb.microservices.model.Employee;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2017/9/23.
 *
 * @author frank.
 */
@Service
public class CompositeServiceImpl implements CompositeService {

    @Autowired
    private DepartmentClient departmentClient;

    @Autowired
    private EmployeeClient employeeClient;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public DepartAndEmplComposite findCompositeByDepartmentName(String name) {

        Department department = departmentClient.findByDepartmentName(name);

        DepartAndEmplComposite departAndEmplComposite = new DepartAndEmplComposite();

        if (!ObjectUtils.isEmpty(department)) {
            departAndEmplComposite.setId(department.getId());
            departAndEmplComposite.setDepartName(department.getDepartName());
            departAndEmplComposite.setDepartNumber(department.getDepartNumber());

            departAndEmplComposite.setEmployeeList(employeeClient.findEmployeeByDepartmentId(department.getId()));
        }

        return departAndEmplComposite;
    }

    @Override

    public List<Employee> findCompositeEmployeeByName(String name) {
        return restTemplate.getForObject("http://employee-service/findEmployeeByName/" + name, List.class);
    }

}
