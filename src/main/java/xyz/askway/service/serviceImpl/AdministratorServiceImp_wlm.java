package xyz.askway.service.serviceImpl;

import org.springframework.stereotype.Service;
import xyz.askway.controller.AdministratorController_wlm;
import xyz.askway.dao.AdministratorDAO_wml;
import xyz.askway.pojo.Administrator;
import xyz.askway.pojo.Log;
import xyz.askway.service.AdministratorService_wml;
import xyz.askway.util.Log4j2Controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * author:wlm
 * name:管理员service接口实现类
 * function:
 * 2018/10/30 16:52
 */
@Service("dimServiceImp_wlm")
public class AdministratorServiceImp_wlm implements AdministratorService_wml {
    @Resource
    private AdministratorDAO_wml adminDAO; //管理员DAO接口对象

    /**
     * 2018/10/30 20:27
     * #author:wlm
     * #function:查询所有或者按条件查询
     * #analysis:
     */
    @Override
    public <E> E query(Administrator... administrator) {
        if (administrator.length<1)
            return (E)adminDAO.query(null);
        List<Administrator> queryList = adminDAO.query(administrator);
        if (queryList!=null && queryList.size()>0)
            return (E)adminDAO.query(administrator).get(0);
        return null;
    }


    /**
     * 2018/10/31 9:27
     * #author:wlm
     * #function:管理员登录日志
     * #analysis:
     */
    @Override
    public Integer logRecord(String administratorID, HttpServletRequest request) {
        Log log = new Log();
        log.setUId(administratorID);
        String ip = request.getHeader("x-forwarded-for");
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("PRoxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        log.setLogIp(ip.equals("0:0:0:0:0:0:0:1")?"127.0.0.1":ip);
        return adminDAO.logRecord(log);
    }

    /**
     * 2018/10/31 10:16
     * #author:wlm
     * #function:管理员登录日志查询
     * #analysis:
     */
    @Override
    public List<Log> queryLog(Integer page,Integer record) {
        try{
            List<Log> logs = adminDAO.queryLog(page == 0 ? 0 : (page - 1) * record, record);
            if (logs.size()<1) AdministratorController_wlm.setCurr(0);
            return logs.size()<1 ?adminDAO.queryLog(0, record) : logs;
        }catch(Exception e){
            Log4j2Controller.error("错误：execute Line 76 'return adminDAO.queryLog(page,record);' ERROR.");
        }
        return null;
    }

    /**
     * 2018/11/1 9:22
     * #author:wlm
     * #function:统计日志的总记录数
     * #analysis:
     */
    @Override
    public Integer logStatisticsSum() {
        try {
            return Integer.parseInt(adminDAO.logStatisticsSum().get(0).get("sum").toString());
        }catch(Exception e){
            Log4j2Controller.error("错误：execute Line 92 'return Integer.parseInt(adminDAO.logStatisticsSum().get(0).get(\"sum\").toString())' ERROR.");
        }
        return null;
    }

    /**
     * 2018/11/1 15:06
     * #author:wlm
     * #function:删除管理员登录日志
     * #analysis:
     */
    @Override
    public Integer deleteLogs(Map<String,Object> LogID) {

        return adminDAO.deleteLogs(LogID);
    }
}