package xyz.askway.service;


import xyz.askway.pojo.Role;

import java.util.List;

public interface RoleService {
    /*
     * @Author Uncle Liu
     * @Description //TODO 查询所有Role
     * @Date 18:36 2018/10/30
     **/
    public List<Role> selectRole();
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id查询Role
     * @Date 18:36 2018/10/30
     **/
    public Role getRoleById(String rId);
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id查询Role
     * @Date 18:36 2018/10/30
     **/
    public Role getRoleById1(String rId);
    /*
     * @Author Uncle Liu
     * @Description //TODO 添加Role
     * @Date 18:37 2018/10/30
     **/
    public void addRole(Role role);
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id删除Role
     * @Date 18:37 2018/10/30
     **/
    public void deleteRole(String rId);
    /*
     * @Author Uncle Liu
     * @Description //TODO 修改Role
     * @Date 18:37 2018/10/30
     **/
    public void updateRole(Role role);
}
