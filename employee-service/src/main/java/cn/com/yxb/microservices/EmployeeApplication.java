package cn.com.yxb.microservices;

import cn.com.yxb.microservices.model.Employee;
import cn.com.yxb.microservices.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

import java.util.Arrays;

/**
 * Created on 2017/9/23.
 *
 * @author frank.
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class EmployeeApplication implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(EmployeeApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Employee employee = new Employee();

        employee.setDepartmentId(1L);
        employee.setEmployeeAge(23);
        employee.setEmployeeName("binbin");

        Employee employee1 = new Employee();
        employee1.setDepartmentId(1L);
        employee1.setEmployeeAge(34);
        employee1.setEmployeeName("lisi");

        Employee employee2 = new Employee();
        employee2.setDepartmentId(2L);
        employee2.setEmployeeAge(25);
        employee2.setEmployeeName("561");

        employeeRepository.save(Arrays.asList(employee, employee1, employee2));

    }
}
