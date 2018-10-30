package xyz.askway.service;

import xyz.askway.pojo.Administrator;

import java.util.List;

public interface AdministratorService {
    /*
     * @Author Uncle Liu
     * @Description //TODO 查询所有Administrator
     * @Date 18:36 2018/10/30
     **/
    public List<Administrator> selectArticle();
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id查询Administrator
     * @Date 18:36 2018/10/30
     **/
    public Administrator getAdministratorById(String aId);
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id查询Administrator
     * @Date 18:36 2018/10/30
     **/
    public Administrator getAdministratorById1(String aId);
    /*
     * @Author Uncle Liu
     * @Description //TODO 添加Administrator
     * @Date 18:37 2018/10/30
     **/
    public void addAdministrator(Administrator administrator);
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id删除Administrator
     * @Date 18:37 2018/10/30
     **/
    public void deleteAdministrator(String aId);
    /*
     * @Author Uncle Liu
     * @Description //TODO 修改Administrator
     * @Date 18:37 2018/10/30
     **/
    public void updateAdministrator(Administrator administrator);
}
