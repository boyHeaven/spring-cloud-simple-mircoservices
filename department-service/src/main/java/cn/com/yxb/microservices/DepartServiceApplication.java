package cn.com.yxb.microservices;

import cn.com.yxb.microservices.model.Department;
import cn.com.yxb.microservices.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

/**
 * Created on 2017/9/23.
 *
 * @author frank.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DepartServiceApplication implements CommandLineRunner {

    @Autowired
    private DepartmentRepository departmentRepository;

    public static void main(String[] args) {
        SpringApplication.run(DepartServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Department department = new Department();

        department.setDepartName("测试部");
        department.setDepartNumber("0001");

        Department department1 = new Department();

        department1.setDepartName("生产部");
        department1.setDepartNumber("0002");

        departmentRepository.save(Arrays.asList(department, department1));


    }
}
