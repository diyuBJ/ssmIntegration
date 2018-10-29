package xyz.askway.service.serviceImpl;

import org.springframework.stereotype.Service;
import xyz.askway.dao.CURD;
import xyz.askway.pojo.StudentBean;
import xyz.askway.service.CURDService;

import javax.annotation.Resource;
import java.util.List;

/**
 * author:wlm
 * name:
 * function:
 * 2018/10/22 11:07
 */
@Service("cURDSericeImpl")
public class CURDSericeImpl implements CURDService {
    @Resource
    private CURD curd;

    @Override
    public List<StudentBean> queryAll() {
        return curd.queryAll();
    }

    @Override
    public StudentBean queryOne(String arg) {
        return curd.queryOne(arg);
    }

    @Override
    public Integer addOne(StudentBean stu) {
        return curd.addOne(stu);
    }

    @Override
    public Integer update(StudentBean stu) {
        return curd.update(stu);
    }

    @Override
    public Integer delete(String name) {
        return curd.delete(name);
    }
}
