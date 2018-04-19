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
public class Department {

    @Id
    @GeneratedValue
    private Long id;

    /**
     * 部门名称.
     */
    private String departName;

    /**
     * 部门编号.
     */
    private String departNumber;



}
