package cn.com.yxb.microservices.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created on 2017/9/23.
 *
 * @author frank.
 */
@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Long id;

    private Long departmentId;

    private String employeeName;

    private int employeeAge;

}
