package cn.com.yxb.microservices.controller;

import cn.com.yxb.microservices.model.DepartAndEmplComposite;
import cn.com.yxb.microservices.service.CompositeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2017/9/23.
 *
 * @author frank.
 */
@RestController
@RequestMapping
public class CompositeController {

    @Autowired
    private CompositeService compositeService;

    @GetMapping(value = "/findCompositeByDepartmentName/{departName}")
    public DepartAndEmplComposite findCompositeByDepartmentName(@PathVariable(value = "departName") String departName) {

        return compositeService.findCompositeByDepartmentName(departName);

    }
}
