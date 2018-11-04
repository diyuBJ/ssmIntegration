package xyz.askway.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.askway.pojo.Article;
import xyz.askway.pojo.Programa;
import xyz.askway.service.ArticleService;
import xyz.askway.service.ProgramaService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Uncle Liu
 * @ClassName: FrontEndController
 * @Description: TODO(类说明 ：)
 * @date 2018/11/3 16:53
 */
@Controller
@RequestMapping(value = "/FrontEnd")
public class FrontEndController {
    //栏目
    @Resource
    private ProgramaService programaService;
    //文章
    @Resource
    private ArticleService articleService;

    @RequestMapping(value = "/index.do",produces="text/html;charset=UTF-8")
    @ResponseBody
    public String index(){
        //得到栏目
        List<Programa> programaList = programaService.queryPrograma();
        //得到文章
        List<Article> articleList = articleService.selectArticle("", 1, 1);
        System.out.println("*****************");
        System.out.println("*****************");
        System.out.println("*****************");
        System.out.println("*****************");
        System.out.println("*****************");
        System.out.println("*****************");
        List<Object> objectList = new ArrayList<>();
        objectList.add(programaList);
        objectList.add(articleList);
        return JSONObject.toJSONString(objectList);
    }
}
