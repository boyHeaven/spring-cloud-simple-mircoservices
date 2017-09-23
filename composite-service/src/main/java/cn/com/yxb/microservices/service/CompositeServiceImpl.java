package cn.com.yxb.microservices.service;

import cn.com.yxb.microservices.client.DepartmentClient;
import cn.com.yxb.microservices.model.DepartAndEmplComposite;
import cn.com.yxb.microservices.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

/**
 * Created on 2017/9/23.
 *
 * @author frank.
 */
@Service
public class CompositeServiceImpl implements CompositeService {

    @Autowired
    private DepartmentClient departmentClient;

    @Override
    public DepartAndEmplComposite findCompositeByDepartmentName(String name) {

        Department department = departmentClient.findByDepartmentName(name);

        DepartAndEmplComposite departAndEmplComposite = new DepartAndEmplComposite();

        if (!ObjectUtils.isEmpty(department)) {
            departAndEmplComposite.setId(department.getId());
            departAndEmplComposite.setDepartName(department.getDepartName());
            departAndEmplComposite.setDepartNumber(department.getDepartNumber());
        }

        return departAndEmplComposite;
    }
}
