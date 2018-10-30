package xyz.askway.service.serviceImpl;

import org.springframework.stereotype.Service;
import xyz.askway.dao.AdvertisingToInformDao;
import xyz.askway.pojo.AdvertisingToInform;
import xyz.askway.service.AdvertisingToInformService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Uncle Liu
 * @ClassName: AdvertisingToInformImpl
 * @Description: TODO(类说明 ：)
 * @date 2018/10/30 19:24
 */
@Service("advertisingToInformImpl")
public class AdvertisingToInformImpl implements AdvertisingToInformService {
    @Resource
    private AdvertisingToInformDao advertisingToInformDao;

    @Override
    public List<AdvertisingToInform> selectAdvertisingToInform() {
        return advertisingToInformDao.selectAdvertisingToInform();
    }

    @Override
    public AdvertisingToInform getAdvertisingToInformById(String gId) {
        return advertisingToInformDao.getAdvertisingToInformById(gId);
    }

    @Override
    public AdvertisingToInform getAdvertisingToInformById1(String gId) {
        return advertisingToInformDao.getAdvertisingToInformById1(gId);
    }

    @Override
    public void addAdvertisingToInform(AdvertisingToInform advertisingToInform) {
        advertisingToInformDao.addAdvertisingToInform(advertisingToInform);
    }

    @Override
    public void deleteAdvertisingToInform(String gId) {
        advertisingToInformDao.deleteAdvertisingToInform(gId);
    }

    @Override
    public void updateAdvertisingToInform(AdvertisingToInform advertisingToInform) {
        advertisingToInformDao.updateAdvertisingToInform(advertisingToInform);
    }
}
