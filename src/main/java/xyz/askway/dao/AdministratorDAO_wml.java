package xyz.askway.dao;

import org.apache.ibatis.annotations.Param;
import xyz.askway.pojo.Administrator;

import java.util.List;

/**
 * author:wlm
 * name:管理员DAO接口
 * function:
 * 2018/10/30 16:44
 */
public interface AdministratorDAO_wml {

    /**
     * 2018/10/30 16:45
     * #author:wlm
     * #function:查询管理员(all or condition)
     * #analysis:
     */
    List<Administrator> query(@Param("administrator")Administrator... administrator);


}
