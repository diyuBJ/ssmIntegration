package xyz.askway.service;

import org.apache.ibatis.annotations.Param;
import xyz.askway.pojo.Article;

import java.util.List;
import java.util.Map;

public interface ArticleService {
    /*
     * @Author Uncle Liu
     * @Description //TODO 分页查询Article
     * @Date 18:36 2018/10/30
     **/
    List<Article> selectArticle(@Param("criteria") String criteria, @Param("page") Integer page, @Param("record") Integer record);
    /*
     * @Author Uncle Liu
     * @Description //TODO 统计文章总记录数
     * @Date 14:41 2018/11/1
     **/
    Integer articleStatisticsSum(@Param("criteria") String criteria);
    /*
     * @Author Uncle Liu
     * @Description //TODO 分页查询Article根据栏目id
     * @Date 18:36 2018/10/30
     **/
    List<Article> selectArticleByProgramaId(@Param("criteria") String criteria, @Param("page") Integer page, @Param("record") Integer record);
    /*
     * @Author Uncle Liu
     * @Description //TODO 统计文章总记录数根据栏目id
     * @Date 14:41 2018/11/1
     **/
    Integer  articleByProgramaStatisticsSum(@Param("criteria") String criteria);
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id查询Article
     * @Date 18:36 2018/10/30
     **/
    Article getArticleById(String aId);
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据栏目id查询Article
     * @Date 18:36 2018/10/30
     **/
    List<Article> getArticleByProgramaId(String pId);
    /*
     * @Author Uncle Liu
     * @Description //TODO 模糊查询（标题或者标签）
     * @Date 18:36 2018/10/30
     **/
    List<Article> getArticleLike(String text);
    /*
     * @Author Uncle Liu
     * @Description //TODO 添加Article
     * @Date 18:37 2018/10/30
     **/
    void addArticle(Article article);
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据条件删除Article
     * @Date 18:37 2018/10/30
     **/
    int deleteArticle(Article article);
    /*
     * @Author Uncle Liu
     * @Description //TODO 修改Article
     * @Date 18:37 2018/10/30
     **/
    void updateArticle(Article article);
    /*
     * @Author Uncle Liu
     * @Description //TODO 修改Article阅读量
     * @Date 18:37 2018/10/30
     **/
    int updateArticleAReadingQuantity(@Param("aId")String aId);
}
