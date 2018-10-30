package xyz.askway.service;

import xyz.askway.pojo.Article;

import java.util.List;

public interface ArticleService {
    /*
     * @Author Uncle Liu
     * @Description //TODO 查询所有Article
     * @Date 18:36 2018/10/30
     **/
    public List<Article> selectArticle();
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id查询Article
     * @Date 18:36 2018/10/30
     **/
    public Article getArticleById(String aId);
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id查询Article
     * @Date 18:36 2018/10/30
     **/
    public Article getArticleById1(String aId);
    /*
     * @Author Uncle Liu
     * @Description //TODO 添加Article
     * @Date 18:37 2018/10/30
     **/
    public void addArticle(Article article);
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id删除Article
     * @Date 18:37 2018/10/30
     **/
    public void deleteArticle(String aId);
    /*
     * @Author Uncle Liu
     * @Description //TODO 修改Article
     * @Date 18:37 2018/10/30
     **/
    public void updateArticle(Article article);
}
