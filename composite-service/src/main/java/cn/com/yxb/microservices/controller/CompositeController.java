package cn.com.yxb.microservices.controller;

import cn.com.yxb.microservices.model.DepartAndEmplComposite;
import cn.com.yxb.microservices.model.Employee;
import cn.com.yxb.microservices.service.CompositeService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2017/9/23.
 *
 * @author frank.
 */
@RestController
@RequestMapping
public class CompositeController {

    Logger logger = LoggerFactory.getLogger(CompositeController.class);


    @Autowired
    private CompositeService compositeService;

    @GetMapping(value = "/findCompositeByDepartmentName/{departName}")
    public DepartAndEmplComposite findCompositeByDepartmentName(@PathVariable(value = "departName") String departName) {

        return compositeService.findCompositeByDepartmentName(departName);

    }

    @GetMapping(value = "/findCompositeEmployeeByName/{name}")
    @HystrixCommand(fallbackMethod = "addFallBack")
    public List<Employee> findCompositeEmployeeByName(@PathVariable(value = "name") String name) {

        return compositeService.findCompositeEmployeeByName(name);
    }


    public List<Employee> addFallBack(String name) {
        logger.info("addFallBack List fallBack: {} ", name);
        return new ArrayList<>();
    }


}
