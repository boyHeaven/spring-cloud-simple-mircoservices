package cn.com.yxb.microservices.controller;

import cn.com.yxb.microservices.model.Department;
import cn.com.yxb.microservices.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2017/9/23.
 *
 * @author frank.
 */
@RestController
@RefreshScope
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "/findByDepartmentName/{name}")
    Department findByDepartmentName(@PathVariable(value = "name") String name) {

        return departmentService.findByDepartmentName(name);
    }

}
