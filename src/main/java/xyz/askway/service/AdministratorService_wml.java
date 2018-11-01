package xyz.askway.service;

import org.apache.ibatis.annotations.Param;
import xyz.askway.pojo.Administrator;
import xyz.askway.pojo.Log;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * author:wlm
 * name:管理员service接口
 * function:
 * 2018/10/30 16:44
 */
public interface AdministratorService_wml {

    /**
     * 2018/10/30 16:45
     * #author:wlm
     * #function:查询管理员(all or condition)
     * #analysis:
     */
    <E> E query(Administrator... administrator);

    /**
     * 2018/10/31 9:16
     * #author:wlm
     * #function:管理员登录日志记录
     * #analysis:
     */
    Integer logRecord(String administratorID, HttpServletRequest request);

    /**
     * 2018/10/31 10:02
     * #author:wlm
     * #function:管理员登录日志查询
     * #analysis:
     */
    List<Log> queryLog(Integer page,Integer record);

    /**
     * 2018/11/1 9:21
     * #author:wlm
     * #function:统计日志的总记录数
     * #analysis:
     */
    Integer logStatisticsSum();

    /**
     * 2018/11/1 15:02
     * #author:wlm
     * #function:删除管理员登录日志
     * #analysis:
     */
    Integer deleteLogs(Map<String,Object> LogID);

}
