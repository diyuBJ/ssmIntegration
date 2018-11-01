package xyz.askway.service.serviceImpl;

import org.springframework.stereotype.Service;
import xyz.askway.dao.ArticleDao;
import xyz.askway.pojo.Article;
import xyz.askway.service.ArticleService;

import javax.annotation.Resource;
import java.util.List;

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
    public List<Article> selectArticle() {
        return articleDao.selectArticle();
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
    public void deleteArticle(Article article) {
        articleDao.deleteArticle(article);
    }

    @Override
    public void updateArticle(Article article) {
        articleDao.updateArticle(article);
    }
}
