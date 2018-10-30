package xyz.askway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import xyz.askway.pojo.Administrator;
import xyz.askway.service.AdministratorService_wml;
import xyz.askway.util.Log4j2Controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

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
    public ModelAndView administratorToLogin(ModelAndView mav, Administrator administrator, HttpSession session){
        try{
            //登录失败重置
            session.setAttribute("comeToNothing",null);
            Administrator admi=adms.query(administrator);
            if(admi!=null){
                mav.setViewName("redirect:blogsBackground/index.jsp");
                session.setAttribute("administrator",admi);
            }
            else{
                mav.setViewName("redirect:blogsBackground/login.jsp");
                session.setAttribute("comeToNothing","yes");
            }
            Log4j2Controller.info("信息：execute administratorToLogin -- successful");
        }catch(Exception e){
            Log4j2Controller.error("错误：execute administratorToLogin -- ERROR");
        }
        return mav;
    }

}
