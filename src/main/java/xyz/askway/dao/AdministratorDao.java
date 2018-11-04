package xyz.askway.dao;

import xyz.askway.pojo.Administrator;
import xyz.askway.pojo.Article;

import java.util.List;

public interface AdministratorDao {
    /*
     * @Author Uncle Liu
     * @Description //TODO 查询所有Administrator
     * @Date 18:36 2018/10/30
     **/
    List<Administrator> selectAdministrator();
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id查询Administrator
     * @Date 18:36 2018/10/30
     **/
    Administrator getAdministratorById(String uId);
    /*
     * @Author Uncle Liu
     * @Description //TODO 添加Administrator
     * @Date 18:37 2018/10/30
     **/
    void addAdministrator(Administrator administrator);
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id删除Administrator
     * @Date 18:37 2018/10/30
     **/
    void deleteAdministrator(String uId);
    /*
     * @Author Uncle Liu
     * @Description //TODO 修改Administrator
     * @Date 18:37 2018/10/30
     **/
    void updateAdministrator(Administrator administrator);
}
