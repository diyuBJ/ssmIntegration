package xyz.askway.dao;

import org.apache.ibatis.annotations.Param;
import xyz.askway.pojo.Administrator;
import xyz.askway.pojo.Log;

import java.util.List;
import java.util.Map;

/**
 * author:wlm
 * name:管理员DAO接口
 * function:
 * 2018/10/30 16:44
 */
public interface AdministratorDAO_wml {

    /**
     * 2018/10/30 16:45
     * #author:wlm
     * #function:查询管理员(all or condition)
     * #analysis:
     */
    List<Administrator> query(@Param("administrator")Administrator... administrator);

    /**
     * 2018/10/31 9:16
     * #author:wlm
     * #function:管理员登录日志记录
     * #analysis:
     */
    Integer logRecord(@Param("log")Log log);

    /**
     * 2018/10/31 10:02
     * #author:wlm
     * #function:管理员登录日志查询
     * #analysis:
     */
    List<Log> queryLog(@Param("page") Integer page,@Param("record")Integer record);

    /**
     * 2018/11/1 9:21
     * #author:wlm
     * #function:统计日志的总记录数
     * #analysis:
     */
    List<Map<String,Object>> logStatisticsSum();

    /**
     * 2018/11/1 15:02
     * #author:wlm
     * #function:删除管理员登录日志
     * #analysis:
     */
    Integer deleteLogs(@Param("logID") Map<String,Object> LogID);

}
