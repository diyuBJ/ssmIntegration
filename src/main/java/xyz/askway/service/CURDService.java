package xyz.askway.service;

import org.apache.ibatis.annotations.Param;

import xyz.askway.pojo.StudentBean;

import java.util.List;

/**
 * author:wlm
 * name:CURD
 * function:
 * 2018/10/22 10:06
 */
public interface CURDService {
    /**
     * 2018/10/21 9:12
     * #author:wlm
     * #function:查询所有学生
     * #analysis:
     */
    List<StudentBean> queryAll();

    /**
     * 2018/10/21 9:13
     * #author:wlm
     * #function:查询单个学生
     * #analysis:
     */
    StudentBean queryOne(@Param("arg") String arg);

    /**
     * 2018/10/21 10:18
     * #author:wlm
     * #function:添加一个学生
     * #analysis:
     */
    Integer addOne(@Param("stu") StudentBean stu);

    /**
     * 2018/10/21 10:19
     * #author:wlm
     * #function:更新一个学生信息
     * #analysis:
     */
    Integer update(@Param("stu") StudentBean stu);

    /**
     * 2018/10/21 10:20
     * #author:wlm
     * #function:删除一个学生
     * #analysis:
     */
    Integer delete(@Param("name") String name);
}
