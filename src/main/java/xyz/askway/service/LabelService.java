package xyz.askway.service;


import xyz.askway.pojo.Label;

import java.util.List;

public interface LabelService {
    /*
     * @Author Uncle Liu
     * @Description //TODO 查询所有Label
     * @Date 18:36 2018/10/30
     **/
    public List<Label> selectLabel();
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id查询Label
     * @Date 18:36 2018/10/30
     **/
    public Label getLabelById(String lId);
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id查询Label
     * @Date 18:36 2018/10/30
     **/
    public Label getLabelById1(String lId);
    /*
     * @Author Uncle Liu
     * @Description //TODO 添加Label
     * @Date 18:37 2018/10/30
     **/
    public void addLabel(Label label);
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id删除Label
     * @Date 18:37 2018/10/30
     **/
    public void deleteLabel(String lId);
    /*
     * @Author Uncle Liu
     * @Description //TODO 修改Label
     * @Date 18:37 2018/10/30
     **/
    public void updateLabel(Label label);
}
