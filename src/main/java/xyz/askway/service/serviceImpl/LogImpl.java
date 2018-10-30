package xyz.askway.service.serviceImpl;

import org.springframework.stereotype.Service;
import xyz.askway.dao.LinkDao;
import xyz.askway.dao.LogDao;
import xyz.askway.pojo.Link;
import xyz.askway.pojo.Log;
import xyz.askway.service.LinkService;
import xyz.askway.service.LogService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Uncle Liu
 * @ClassName: LogImpl
 * @Description: TODO(类说明 ：)
 * @date 2018/10/30 19:32
 */
@Service("logImpl")
public class LogImpl implements LogService {
    @Resource
    private LogDao logDao;
    /*
     * @Author Uncle Liu
     * @Description //TODO 查询所有Log
     * @Date 18:36 2018/10/30
     **/
    public List<Log> selectLog(){
        return logDao.selectLog();
    }
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id查询Log
     * @Date 18:36 2018/10/30
     **/
    public Log getLogById(String logId){
        return logDao.getLogById(logId);
    }
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id查询Log
     * @Date 18:36 2018/10/30
     **/
    public Log getLogById1(String logId){
        return logDao.getLogById1(logId);
    }
    /*
     * @Author Uncle Liu
     * @Description //TODO 添加Log
     * @Date 18:37 2018/10/30
     **/
    public void addLog(Log log){
        logDao.addLog(log);
    }
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id删除Log
     * @Date 18:37 2018/10/30
     **/
    public void deleteLog(String logId){
        logDao.deleteLog(logId);
    }
    /*
     * @Author Uncle Liu
     * @Description //TODO 修改Log
     * @Date 18:37 2018/10/30
     **/
    public void updateLog(Log log){
        logDao.updateLog(log);
    }
}