package xyz.askway.dao;



import xyz.askway.pojo.Jurisdiction;

import java.util.List;

public interface JurisdictionDao {
    /*
     * @Author Uncle Liu
     * @Description //TODO 查询所有Jurisdiction
     * @Date 18:36 2018/10/30
     **/
    public List<Jurisdiction> selectJurisdiction();
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id查询Jurisdiction
     * @Date 18:36 2018/10/30
     **/
    public Jurisdiction getJurisdictionById(String jId);
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id查询Jurisdiction
     * @Date 18:36 2018/10/30
     **/
    public Jurisdiction getJurisdictionById1(String jId);
    /*
     * @Author Uncle Liu
     * @Description //TODO 添加Jurisdiction
     * @Date 18:37 2018/10/30
     **/
    public void addJurisdiction(Jurisdiction jurisdiction);
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id删除Jurisdiction
     * @Date 18:37 2018/10/30
     **/
    public void deleteJurisdiction(String jId);
    /*
     * @Author Uncle Liu
     * @Description //TODO 修改Jurisdiction
     * @Date 18:37 2018/10/30
     **/
    public void updateJurisdiction(Jurisdiction jurisdiction);
}
