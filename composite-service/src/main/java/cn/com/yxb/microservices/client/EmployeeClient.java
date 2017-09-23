package cn.com.yxb.microservices.client;

import cn.com.yxb.microservices.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2017/9/23.
 *
 * @author frank.
 */
@FeignClient(value = "employee-service", fallback = EmployeeClient.EmployeeClientFallBack.class)
public interface EmployeeClient {

    Logger log = LoggerFactory.getLogger(EmployeeClient.class);

    @GetMapping(value = "/findEmployeeByDepartmentId/{departmentId}")
    List<Employee> findEmployeeByDepartmentId(@PathVariable(value = "departmentId") Long id);

    @Component
    class EmployeeClientFallBack implements EmployeeClient {

        @Override
        public List<Employee> findEmployeeByDepartmentId(Long id) {

            log.error("通过部门Id查询员工失败======部门Id=" + id);

            return new ArrayList<>();
        }
    }


}
