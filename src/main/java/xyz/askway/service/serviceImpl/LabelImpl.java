package xyz.askway.service.serviceImpl;

import org.springframework.stereotype.Service;
import xyz.askway.dao.LabelDao;
import xyz.askway.pojo.Label;
import xyz.askway.service.LabelService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Uncle Liu
 * @ClassName: LabelImpl
 * @Description: TODO(类说明 ：)
 * @date 2018/10/30 19:30
 */
@Service("labelImpl")
public class LabelImpl implements LabelService {
    @Resource
    private LabelDao labelDao;
    /*
     * @Author Uncle Liu
     * @Description //TODO 查询所有Label
     * @Date 18:36 2018/10/30
     **/
    public List<Label> selectLabel(){
        return labelDao.selectLabel();
    }
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id查询Label
     * @Date 18:36 2018/10/30
     **/
    public Label getLabelById(String lId){
        return labelDao.getLabelById(lId);
    }
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id查询Label
     * @Date 18:36 2018/10/30
     **/
    public Label getLabelById1(String lId){
        return labelDao.getLabelById1(lId);
    }
    /*
     * @Author Uncle Liu
     * @Description //TODO 添加Label
     * @Date 18:37 2018/10/30
     **/
    public void addLabel(Label label){
        labelDao.addLabel(label);
    }
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id删除Label
     * @Date 18:37 2018/10/30
     **/
    public void deleteLabel(String lId){
        labelDao.deleteLabel(lId);
    }
    /*
     * @Author Uncle Liu
     * @Description //TODO 修改Label
     * @Date 18:37 2018/10/30
     **/
    public void updateLabel(Label label){
        labelDao.updateLabel(label);
    }
}
