package xyz.askway.service.serviceImpl;

import org.springframework.stereotype.Service;
import xyz.askway.dao.RoleDao;
import xyz.askway.pojo.Role;
import xyz.askway.service.RoleService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Uncle Liu
 * @ClassName: RoleImpl
 * @Description: TODO(类说明 ：)
 * @date 2018/10/30 19:36
 */
@Service("roleImpl")
public class RoleImpl implements RoleService {
    @Resource
    private RoleDao roleDao;
    /*
     * @Author Uncle Liu
     * @Description //TODO 查询所有Role
     * @Date 18:36 2018/10/30
     **/
    public List<Role> selectRole(){
        return roleDao.selectRole();
    }
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id查询Role
     * @Date 18:36 2018/10/30
     **/
    public Role getRoleById(String rId){
        return roleDao.getRoleById(rId);
    }
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id查询Role
     * @Date 18:36 2018/10/30
     **/
    public Role getRoleById1(String rId){
        return roleDao.getRoleById1(rId);
    }
    /*
     * @Author Uncle Liu
     * @Description //TODO 添加Role
     * @Date 18:37 2018/10/30
     **/
    public void addRole(Role role){
        roleDao.addRole(role);
    }
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id删除Role
     * @Date 18:37 2018/10/30
     **/
    public void deleteRole(String rId){
        roleDao.deleteRole(rId);
    }
    /*
     * @Author Uncle Liu
     * @Description //TODO 修改Role
     * @Date 18:37 2018/10/30
     **/
    public void updateRole(Role role){
        roleDao.updateRole(role);
    }
}
