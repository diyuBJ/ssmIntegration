package xyz.askway.controller;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import xyz.askway.pojo.Administrator;
import xyz.askway.pojo.Article;
import xyz.askway.service.ArticleService;
import xyz.askway.util.Log4j2Controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author Uncle Liu
 * @ClassName: ArticleController
 * @Description: TODO(类说明 ：)
 * @date 2018/10/31 19:13
 */
@Transactional
@Controller
public class ArticleController {
    @Resource
    private ArticleService articleService;


    /*
     * @Author Uncle Liu
     * @Description //TODO 初始分页加载文章
     * @Date 16:40 2018/11/2
     **/
    @RequestMapping(value = "/getArticle.do")
    public  String getArticle(HttpSession session){
        //初始分页加载文章
        List<Article> articles = articleService.selectArticle("",1,5);
        Integer integer = articleService.articleStatisticsSum("");
        session.setAttribute("articles",articles);
        session.setAttribute("articlesum",integer);
        return "redirect:blogsBackground/article.jsp";
    }

    @RequestMapping(value = "/paging.do",produces="text/html;charset=UTF-8")
    @ResponseBody
    public String paging(String criteria,Integer curr,Integer limit){
        //分页查询
        List<Object> li = new ArrayList<>();
        li.add(articleService.articleStatisticsSum(criteria));
        li.add(articleService.selectArticle(criteria,curr,limit));
        return JSONObject.toJSONString(li);
    }


    @RequestMapping(value = "/addArticle.do",method = RequestMethod.POST)
    public String addArticle(Article article,HttpSession session){
        try{
            //添加文章
            //设置创建文章的管理员id
            Administrator administrator=(Administrator)session.getAttribute("administrator");
            article.setAdministrator(administrator);
            //设置文章id
            article.setAId(java.util.UUID.randomUUID().toString());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            article.setATime(sdf.format(new Date()));
            articleService.addArticle(article);
//            session.removeAttribute("articles");
//            session.removeAttribute("articlesum");
//            this.getArticle(session);
        }catch(Exception e){
            Log4j2Controller.error("错误：xyz.askway.controller.ArticleController.addArticle ;' ERROR.");
        }
        return "redirect:blogsBackground/article.jsp";
    }


    @RequestMapping(value = "/fileUploadPage.do", method = RequestMethod.POST)
    @ResponseBody
    public String upload(HttpServletRequest req) throws Exception{
        //ajax上传图片
        MultipartHttpServletRequest mreq = (MultipartHttpServletRequest)req;
        MultipartFile file = mreq.getFile("file");
        String fileName = file.getOriginalFilename();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String name=req.getSession().getServletContext().getRealPath("/")+
                "upload\\"+sdf.format(new Date())+fileName.substring(fileName.lastIndexOf('.'));
        FileOutputStream fos = new FileOutputStream(name);
        fos.write(file.getBytes());
        fos.flush();
        fos.close();
        return name;
    }

    @RequestMapping(value = "/delArticle.do")
    @ResponseBody
    public String delArticle(Article article,HttpSession session){
        try{
            //删除文章
            int i = articleService.deleteArticle(article);
//            this.getArticle(session);
            return i+"";
        }catch(Exception e){
            Log4j2Controller.error("错误：xyz.askway.controller.ArticleController.delArticle(int i = articleService.deleteArticle(article);) ;' ERROR.");
        }
        return "";
    }

}
