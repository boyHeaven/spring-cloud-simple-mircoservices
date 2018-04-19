package cn.com.yxb.microservices.repository;

import cn.com.yxb.microservices.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created on 2017/9/23.
 *
 * @author frank.
 */
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Department findByDepartName(String departmentName);

    Department findByDepartNumber(String departmentNumber);


}
