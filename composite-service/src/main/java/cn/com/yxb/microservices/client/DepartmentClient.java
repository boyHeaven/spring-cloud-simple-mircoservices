package cn.com.yxb.microservices.client;

import cn.com.yxb.microservices.model.Department;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created on 2017/9/23.
 *
 * @author frank.
 */
@FeignClient(value = "department-service", fallbackFactory = DepartmentClient.DepartmentClientFactory.class)
//@FeignClient(value = "department-service", fallback = DepartmentClient.DepartmentClientFallBack.class)
//@FeignClient(value = "department-service", configuration = ClientHystrix.class)
public interface DepartmentClient {

    @GetMapping(value = "/findByDepartmentName/{name}")
    Department findByDepartmentName(@PathVariable(value = "name") String name);


    @Component
    class DepartmentClientFactory implements FallbackFactory<DepartmentClient> {

        Logger log = LoggerFactory.getLogger(DepartmentClient.class);

        @Override
        public DepartmentClient create(Throwable cause) {
            return new DepartmentClient() {
                @Override
                public Department findByDepartmentName(String name) {

                    log.error("查找部门失败=====" + cause.getMessage());

                    return new Department();
                }
            };
        }
    }

//    @Component
//    class DepartmentClientFallback implements DepartmentClient {
//
//        Logger log = LoggerFactory.getLogger(DepartmentClient.class);
//
//        @Override
//        public Department findByDepartmentName(String name) {
//
//            log.error("查找部门失败=====" + name);
//
//            return new Department();
//        }
//    }

}
