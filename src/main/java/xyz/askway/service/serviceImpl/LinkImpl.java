package xyz.askway.service.serviceImpl;

import org.springframework.stereotype.Service;
import xyz.askway.dao.LinkDao;
import xyz.askway.pojo.Link;
import xyz.askway.service.LinkService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Uncle Liu
 * @ClassName: LinkImpl
 * @Description: TODO(类说明 ：)
 * @date 2018/10/30 19:32
 */
@Service("linkImpl")
public class LinkImpl implements LinkService {
    @Resource
    private LinkDao linkDao;
    /*
     * @Author Uncle Liu
     * @Description //TODO 查询所有Link
     * @Date 18:36 2018/10/30
     **/
    public List<Link> selectLink(){
        return linkDao.selectLink();
    }
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id查询Label
     * @Date 18:36 2018/10/30
     **/
    public Link getLinkById(String lId){
        return linkDao.getLinkById(lId);
    }
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id查询Link
     * @Date 18:36 2018/10/30
     **/
    public Link getLinkById1(String lId){
        return linkDao.getLinkById1(lId);
    }
    /*
     * @Author Uncle Liu
     * @Description //TODO 添加Link
     * @Date 18:37 2018/10/30
     **/
    public void addLink(Link link){
        linkDao.addLink(link);
    }
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id删除Link
     * @Date 18:37 2018/10/30
     **/
    public void deleteLink(String lId){
        linkDao.deleteLink(lId);
    }
    /*
     * @Author Uncle Liu
     * @Description //TODO 修改Link
     * @Date 18:37 2018/10/30
     **/
    public void updateLink(Link link){
        linkDao.updateLink(link);
    }
}
