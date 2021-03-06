package cn.com.yxb.microservices.model;

import lombok.Data;

import java.util.List;

/**
 * Created on 2017/9/23.
 *
 * @author frank.
 */
@Data
public class DepartAndEmplComposite {

    private Long id;

    private String departName;

    private String departNumber;

    List<Employee> employeeList;

}
