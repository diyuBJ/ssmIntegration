package xyz.askway.dao;


import xyz.askway.pojo.Link;

import java.util.List;

public interface LinkDao {
    /*
     * @Author Uncle Liu
     * @Description //TODO 查询所有Link
     * @Date 18:36 2018/10/30
     **/
    public List<Link> selectLink();
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id查询Label
     * @Date 18:36 2018/10/30
     **/
    public Link getLinkById(String lId);
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id查询Link
     * @Date 18:36 2018/10/30
     **/
    public Link getLinkById1(String lId);
    /*
     * @Author Uncle Liu
     * @Description //TODO 添加Link
     * @Date 18:37 2018/10/30
     **/
    public void addLink(Link link);
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id删除Link
     * @Date 18:37 2018/10/30
     **/
    public void deleteLink(String lId);
    /*
     * @Author Uncle Liu
     * @Description //TODO 修改Link
     * @Date 18:37 2018/10/30
     **/
    public void updateLink(Link link);
}
