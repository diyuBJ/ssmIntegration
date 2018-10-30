package xyz.askway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Uncle Liu
 * @ClassName: ArticleController
 * @Description: TODO(类说明 ：)
 * @date 2018/10/30 18:10
 */
@Controller
public class ArticleController {
    @RequestMapping(value = "/selectArticle.do",method = RequestMethod.POST)
    public void selectArticle(){

    }
}
