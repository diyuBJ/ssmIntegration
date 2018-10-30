package xyz.askway.service.serviceImpl;

import org.springframework.stereotype.Service;
import xyz.askway.dao.AdministratorDAO_wml;
import xyz.askway.pojo.Administrator;
import xyz.askway.service.AdministratorService_wml;

import javax.annotation.Resource;
import java.util.List;

/**
 * author:wlm
 * name:管理员service接口实现类
 * function:
 * 2018/10/30 16:52
 */
@Service("dimServiceImp_wlm")
public class AdministratorServiceImp_wlm implements AdministratorService_wml {
    @Resource
    private AdministratorDAO_wml adminDAO; //管理员DAO接口对象

    /**
     * 2018/10/30 20:27
     * #author:wlm
     * #function:查询所有或者按条件查询
     * #analysis:
     */
    @Override
    public <E> E query(Administrator... administrator) {
        if (administrator.length<1)
            return (E)adminDAO.query(null);
        List<Administrator> queryList = adminDAO.query(administrator);
        if (queryList!=null && queryList.size()>0)
            return (E)adminDAO.query(administrator).get(0);
        return null;
    }
}