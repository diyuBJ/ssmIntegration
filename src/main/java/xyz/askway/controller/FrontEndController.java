package xyz.askway.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
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

    /*
     * @Author Uncle Liu
     * @Description //TODO 首页初始绑值
     * @Date 11:09 2018/11/4
     **/
    @RequestMapping(value = "/index.do",produces="text/html;charset=UTF-8")
    @ResponseBody
    public String index(int page,int record){
        List<Object> objectList = new ArrayList<>();
        System.out.println(JSONObject.toJSONString(objectList)+"***************");
        int i=articleService.articleStatisticsSum("");
        //总数大于查询的数
        if(i>(page-1)*record){
            //得到栏目
            List<Programa> programaList = programaService.queryPrograma();
            objectList.add(programaList);
            //得到文章
            List<Article> articleList = articleService.selectArticle("", page, record);
            for (Article a:articleList) {
                Programa programa = new Programa();
                programa.setPName(a.getPrograma().getPName());
                a.setPrograma(programa);
            }
            articleService.articleStatisticsSum("");
            objectList.add(articleList);
            return JSONObject.toJSONString(objectList);
        }
        return JSONObject.toJSONString(objectList);
    }

    /*
     * @Author Uncle Liu
     * @Description //TODO 加载单个文章
     * @Date 11:09 2018/11/4
     **/
    @RequestMapping(value = "/article_id.do",produces="text/html;charset=UTF-8")
    @ResponseBody
    public String article_id(String aid){
        List<Object> objectList = new ArrayList<>();
        //根据id查询
        Article article =articleService.getArticleById(aid);
        if(article!=null){
            List<Programa> programaList = programaService.queryPrograma();
            objectList.add(programaList);
            objectList.add(article);
        }
        return JSONObject.toJSONString(objectList);
    }
    /*
     * @Author Uncle Liu
     * @Description //TODO 修改阅读量
     * @Date 11:09 2018/11/4
     **/
    @RequestMapping(value = "/updateArticleAReadingQuantity.do")
    public void updateArticleAReadingQuantity(String aid){
        articleService.updateArticleAReadingQuantity(aid);
    }

    /*
     * @Author Uncle Liu
     * @Description //TODO 加载栏目文章
     * @Date 11:09 2018/11/4
     **/
    @RequestMapping(value = "/category_query.do",produces="text/html;charset=UTF-8")
    @ResponseBody
    public String category_query(String pid,int page,int record){
        List<Object> objectList = new ArrayList<>();
        int i=articleService.articleByProgramaStatisticsSum(pid);
        //总数大于查询的数
        if(i>(page-1)*record){
            //得到栏目
            List<Programa> programaList = programaService.queryPrograma();
            objectList.add(programaList);
            //得到文章
            List<Article> articleList = articleService.selectArticleByProgramaId(pid, page, record);
            for (Article a:articleList) {
                Programa programa = new Programa();
                programa.setPName(a.getPrograma().getPName());
                a.setPrograma(programa);
            }
            articleService.articleStatisticsSum(pid);
            objectList.add(articleList);
            return JSONObject.toJSONString(objectList);
        }
        return JSONObject.toJSONString(objectList);
    }
}
