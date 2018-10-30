package xyz.askway.dao;

import xyz.askway.pojo.Administrator;

import java.util.List;

/*
 * @Author Uncle Liu
 * @Description //TODO 管理员dao接口
 * @Date 15:32 2018/10/30
 **/
public interface AdministratorDao {
    /*
     * @Author Uncle Liu
     * @Description //TODO 增加Administrator
     * @Date 15:33 2018/10/30
     **/
    public void addAdministrator(Administrator administrator);
    /*
     * @Author Uncle Liu
     * @Description //TODO 删除Administrator
     * @Date 15:34 2018/10/30
     **/
    public void deleteAdministrator(Administrator administrator);
    /*
     * @Author Uncle Liu
     * @Description //TODO 修改Administrator
     * @Date 15:35 2018/10/30

     **/
    public void updateAdministrator(Administrator administrator);
    /*
     * @Author Uncle Liu
     * @Description //TODO 查询Administrator
     * @Date 15:36 2018/10/30
     **/
    public Administrator getAdministrator(Administrator administrator);
    /*
     * @Author Uncle Liu
     * @Description //TODO 查询全部Administrator
     * @Date 15:37 2018/10/30
     **/
    public List<Administrator> selectAllAdministrator();
}
