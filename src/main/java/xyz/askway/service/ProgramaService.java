package xyz.askway.service;

import xyz.askway.pojo.Programa;

import java.util.List;

public interface ProgramaService {
    /*
     * @Author Uncle Liu
     * @Description //TODO 查询所有Programa
     * @Date 18:36 2018/10/30
     **/
    public List<Programa> selectPrograma();
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id查询Programa
     * @Date 18:36 2018/10/30
     **/
    public Programa getProgramaById(Integer pId);
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id查询Programa
     * @Date 18:36 2018/10/30
     **/
    public Programa getProgramaById1(Integer pId);
    /*
     * @Author Uncle Liu
     * @Description //TODO 添加Programa
     * @Date 18:37 2018/10/30
     **/
    public void addPrograma(Programa programa);
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id删除Programa
     * @Date 18:37 2018/10/30
     **/
    public void deletePrograma(Integer pId);
    /*
     * @Author Uncle Liu
     * @Description //TODO 修改Programa
     * @Date 18:37 2018/10/30
     **/
    public void updatePrograma(Programa programa);
}
