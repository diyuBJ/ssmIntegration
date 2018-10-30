package xyz.askway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.askway.dao.AdministratorDao;
import xyz.askway.pojo.Administrator;

import javax.annotation.Resource;

/**
 * @author Uncle Liu
 * @ClassName: LoginController
 * @Description: TODO(类说明 ：)
 * @date 2018/10/30 15:54
 */
@Controller
public class LoginController {
    @Resource
    private AdministratorDao administratorDao;
    @RequestMapping(value = "/login.do")
    public void login(Administrator administrator){
        System.out.println(administrator);
        Administrator administrator1 = administratorDao.getAdministrator(administrator);
        System.out.println(administrator1);
    }
}
