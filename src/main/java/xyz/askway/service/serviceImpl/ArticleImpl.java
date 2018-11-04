package xyz.askway.service.serviceImpl;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import xyz.askway.dao.ArticleDao;
import xyz.askway.pojo.Article;
import xyz.askway.service.ArticleService;
import xyz.askway.util.Log4j2Controller;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author Uncle Liu
 * @ClassName: ArticleImpl
 * @Description: TODO(类说明 ：)
 * @date 2018/10/30 19:26
 */
@Service("articleImpl")
public class ArticleImpl implements ArticleService {
    @Resource
    private ArticleDao articleDao;

    @Override
    public List<Article> selectArticle(@Param("criteria")String criteria,@Param("page") Integer page, @Param("record")Integer record) {
        try{
            return articleDao.selectArticle(criteria,page==0?0:(page-1)*record,record);
        }catch(Exception e){
            e.printStackTrace();
            Log4j2Controller.error("错误：execute Line 30 xyz.askway.service.serviceImpl.ArticleImpl.selectArticle 'return articleDao.selectArticle(criteria，page,record);' ERROR.");
        }
        return null;
    }
    /*
     * @Author Uncle Liu
     * @Description //TODO 统计文章总记录数
     * @Date 14:41 2018/11/1
     **/
    public Integer articleStatisticsSum(@Param("criteria") String criteria){
        try {
            return Integer.parseInt(articleDao.articleStatisticsSum(criteria).get(0).get("sum").toString());
        }catch(Exception e){
            Log4j2Controller.error("错误：execute Line 41 'return Integer.parseInt(articleDao.articleStatisticsSum().get(0).get(\"sum\").toString())' ERROR.");
        }
        return null;
    }
    /*
     * @Author Uncle Liu
     * @Description //TODO 分页查询Article根据栏目id
     * @Date 18:36 2018/10/30
     **/
    public List<Article> selectArticleByProgramaId(@Param("criteria") String criteria, @Param("page") Integer page, @Param("record") Integer record){
        try{
            return articleDao.selectArticleByProgramaId(criteria,page==0?0:(page-1)*record,record);
        }catch(Exception e){
            e.printStackTrace();
            Log4j2Controller.error("错误：execute Line 57 xyz.askway.service.serviceImpl.ArticleImpl.selectArticleByProgramaId 'return articleDao.selectArticle(criteria，page,record);' ERROR.");
        }
        return null;
    }
    /*
     * @Author Uncle Liu
     * @Description //TODO 统计文章总记录数根据栏目id
     * @Date 14:41 2018/11/1
     **/
    public Integer  articleByProgramaStatisticsSum(@Param("criteria") String criteria){
        try {
            return Integer.parseInt(articleDao.articleByProgramaStatisticsSum(criteria).get(0).get("sum").toString());
        }catch(Exception e){
            Log4j2Controller.error("错误：execute Line 71 'return Integer.parseInt(articleDao.articleByProgramaStatisticsSum().get(0).get(\"sum\").toString())' ERROR.");
        }
        return null;
    }

    @Override
    public Article getArticleById(String aId) {
        return articleDao.getArticleById(aId);
    }

    /*
     * @Author Uncle Liu
     * @Description //TODO 根据栏目id查询Article
     * @Date 18:36 2018/10/30
     **/
    public List<Article> getArticleByProgramaId(String pId){
        return articleDao.getArticleByProgramaId(pId);
    }
    /*
     * @Author Uncle Liu
     * @Description //TODO 模糊查询（标题或者标签）
     * @Date 18:36 2018/10/30
     **/
    public List<Article> getArticleLike(String text){
        return articleDao.getArticleLike(text);
    }

    @Override
    public void addArticle(Article article) {
        articleDao.addArticle(article);
    }

    /*
     * @Author Uncle Liu
     * @Description //TODO 根据条件删除Article
     * @Date 18:37 2018/10/30
     **/
    @Transactional(propagation = Propagation.REQUIRED)
    public int deleteArticle(Article article) {
        int i=0;
        try {
            i=articleDao.deleteArticle(article);
        }catch (Exception e){
            e.printStackTrace();
            Log4j2Controller.error(e.getMessage());
        }
        return i;
    }

    @Override
    public void updateArticle(Article article) {
        articleDao.updateArticle(article);
    }
    /*
     * @Author Uncle Liu
     * @Description //TODO 修改Article阅读量
     * @Date 18:37 2018/10/30
     **/
    public int updateArticleAReadingQuantity(@Param("aId")String aId){
        return articleDao.updateArticleAReadingQuantity(aId);
    }
}
