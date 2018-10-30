package xyz.askway.service;


import xyz.askway.pojo.Log;

import java.util.List;

public interface LogService {
    /*
     * @Author Uncle Liu
     * @Description //TODO 查询所有Log
     * @Date 18:36 2018/10/30
     **/
    public List<Log> selectLog();
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id查询Log
     * @Date 18:36 2018/10/30
     **/
    public Log getLogById(String logId);
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id查询Log
     * @Date 18:36 2018/10/30
     **/
    public Log getLogById1(String logId);
    /*
     * @Author Uncle Liu
     * @Description //TODO 添加Log
     * @Date 18:37 2018/10/30
     **/
    public void addLog(Log log);
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id删除Log
     * @Date 18:37 2018/10/30
     **/
    public void deleteLog(String logId);
    /*
     * @Author Uncle Liu
     * @Description //TODO 修改Log
     * @Date 18:37 2018/10/30
     **/
    public void updateLog(Log log);
}
