package cn.com.yxb.microservices.service;

import cn.com.yxb.microservices.model.Department;
import cn.com.yxb.microservices.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

/**
 * Created on 2017/9/23.
 *
 * @author frank.
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department findByDepartmentName(String name) {

        Assert.notNull(name, "department name is null");

        return departmentRepository.findByDepartName(name);
    }
}
