package xyz.askway.service.serviceImpl;

import org.springframework.stereotype.Service;
import xyz.askway.dao.AdministratorDao;
import xyz.askway.pojo.Administrator;
import xyz.askway.service.AdministratorService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Uncle Liu
 * @ClassName: AdministratorImpl
 * @Description: TODO(类说明 ：)
 * @date 2018/10/30 18:39
 */
@Service("administratorImpl")
public class AdministratorImpl implements AdministratorService {
    @Resource
    private AdministratorDao administratorDao;

    @Override
    public List<Administrator> selectArticle() {
        return administratorDao.selectArticle();
    }

    @Override
    public Administrator getAdministratorById(String aId) {
        return administratorDao.getAdministratorById(aId);
    }

    @Override
    public Administrator getAdministratorById1(String aId) {
        return administratorDao.getAdministratorById1(aId);
    }

    @Override
    public void addAdministrator(Administrator administrator) {
        administratorDao.addAdministrator(administrator);
    }

    @Override
    public void deleteAdministrator(String aId) {
        administratorDao.deleteAdministrator(aId);
    }

    @Override
    public void updateAdministrator(Administrator administrator) {
        administratorDao.updateAdministrator(administrator);
    }
}
