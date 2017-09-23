package cn.com.yxb.microservices.service;

import cn.com.yxb.microservices.model.DepartAndEmplComposite;

/**
 * Created on 2017/9/23.
 *
 * @author frank.
 */
public interface CompositeService {

    DepartAndEmplComposite findCompositeByDepartmentName(String name);

}
