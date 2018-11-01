package xyz.askway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import xyz.askway.pojo.Administrator;
import xyz.askway.pojo.Log;
import xyz.askway.service.AdministratorService_wml;
import xyz.askway.util.Log4j2Controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * author:wlm
 * name:管理员controller
 * function:
 * 2018/10/30 16:50
 */
@Controller
public class AdministratorController_wlm {

    @Resource
    private AdministratorService_wml adms; //管理员service接口对象

    /**
     * 2018/10/30 20:29
     * #author:wlm
     * #function:管理员登录入口
     * #analysis:
     */
    @RequestMapping("login")
    public ModelAndView administratorToLogin(ModelAndView mav, Administrator administrator, HttpSession session, HttpServletRequest request){
        try{
            //登录失败重置
            session.setAttribute("comeToNothing",null);
            Administrator admi=adms.query(administrator);
            //登录成功
            if(admi!=null){
                mav.setViewName("redirect:blogsBackground/index.jsp");
                session.setAttribute("administrator",admi);
                //管理员登录日志
                adms.logRecord(admi.getUId(),request);
                Log4j2Controller.info("信息：execute administratorToLogin -- info:"+administrator+" land successfully.");
            }
            //登录失败
            else{
                mav.setViewName("redirect:blogsBackground/login.jsp");
                session.setAttribute("comeToNothing","yes");
                Log4j2Controller.info("信息：execute administratorToLogin -- info:"+administrator+" login failure.");
            }
        }catch(Exception e){
            Log4j2Controller.error("错误：execute administratorToLogin -- ERROR:Type conversion failure, list type Cannot be converted into Administrator type.");
        }
        return mav;
    }

    /**
     * 2018/10/30 23:03
     * #author:wlm
     * #function:管理员安全退出
     * #analysis:
     */
    @RequestMapping("exit")
    public ModelAndView exit(ModelAndView mav,HttpSession session){
        Log4j2Controller.info("信息：Administrator in exit "+session.getAttribute("administrator"));

        session.setAttribute("administrator",null);
        mav.setViewName("redirect:blogsBackground/login.jsp");

        Log4j2Controller.info("信息：execute exit -- successful");
        return mav;
    }

    /**
     * 2018/10/31 10:49
     * #author:wlm
     * #function:管理员日志页面绑值
     * #analysis:
     */
    @RequestMapping("administratorLogToValue")
    public ModelAndView administratorLogToValue(ModelAndView mav,HttpSession session){
        Log4j2Controller.info("信息：execute administratorLogToValue");
        List<Log> logs = adms.queryLog(0, 10);
        if (logs!=null){
            session.setAttribute("logList",logs);
            session.setAttribute("logSum",adms.logStatisticsSum()); //待优化
            mav.setViewName("redirect:blogsBackground/loginlog.jsp");
        }else{
            mav.setViewName("redirect:blogsBackground/index.jsp");
        }
        return mav;
    }

    /**
     * 2018/11/1 10:37
     * #author:wlm
     * #function:跟踪修改的页数
     * #analysis:
     */
    @RequestMapping("trackmod")
    public void TRACKMOD(HttpServletResponse response,Integer curr,Integer limit) throws IOException {
        PrintWriter writer = response.getWriter();
        writer.write("ok");
        writer.flush();
        writer.close();
    }

}
