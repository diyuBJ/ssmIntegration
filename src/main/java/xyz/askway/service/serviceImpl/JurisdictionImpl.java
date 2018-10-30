package xyz.askway.service.serviceImpl;

import org.springframework.stereotype.Service;
import xyz.askway.dao.JurisdictionDao;
import xyz.askway.pojo.Jurisdiction;
import xyz.askway.service.JurisdictionService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Uncle Liu
 * @ClassName: JurisdictionImpl
 * @Description: TODO(类说明 ：)
 * @date 2018/10/30 19:28
 */
@Service("jurisdictionImpl")
public class JurisdictionImpl implements JurisdictionService {
    @Resource
    private JurisdictionDao jurisdictionDao;

    @Override
    public List<Jurisdiction> selectJurisdiction() {
        return jurisdictionDao.selectJurisdiction();
    }

    @Override
    public Jurisdiction getJurisdictionById(String jId) {
        return jurisdictionDao.getJurisdictionById(jId);
    }

    @Override
    public Jurisdiction getJurisdictionById1(String jId) {
        return jurisdictionDao.getJurisdictionById1(jId);
    }

    @Override
    public void addJurisdiction(Jurisdiction jurisdiction) {
        jurisdictionDao.addJurisdiction(jurisdiction);
    }

    @Override
    public void deleteJurisdiction(String jId) {
        jurisdictionDao.deleteJurisdiction(jId);
    }

    @Override
    public void updateJurisdiction(Jurisdiction jurisdiction) {
        jurisdictionDao.updateJurisdiction(jurisdiction);
    }
}
