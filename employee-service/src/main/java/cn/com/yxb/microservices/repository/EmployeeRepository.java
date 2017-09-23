package cn.com.yxb.microservices.repository;

import cn.com.yxb.microservices.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created on 2017/9/23.
 *
 * @author frank.
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByDepartmentId(Long id);

    List<Employee> findByEmployeeName(String name);

    Employee findById(Long id);
}
