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

    @Override
    public Article getArticleById1(String aId) {
        return articleDao.getArticleById1(aId);
    }

    @Override
    public void addArticle(Article article) {
        articleDao.addArticle(article);
    }

    @Override
    public void deleteArticle(String aId) {
        articleDao.deleteArticle(aId);
    }

    @Override
    public void updateArticle(Article article) {
        articleDao.updateArticle(article);
    }
}
