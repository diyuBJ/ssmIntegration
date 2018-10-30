package xyz.askway.dao;

import xyz.askway.pojo.AdvertisingToInform;

import java.util.List;

public interface AdvertisingToInformDao {
    /*
     * @Author Uncle Liu
     * @Description //TODO 查询所有AdvertisingToInform
     * @Date 18:36 2018/10/30
     **/
    public List<AdvertisingToInform> selectAdvertisingToInform();
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id查询AdvertisingToInform
     * @Date 18:36 2018/10/30
     **/
    public AdvertisingToInform getAdvertisingToInformById(String gId);
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id查询AdvertisingToInform
     * @Date 18:36 2018/10/30
     **/
    public AdvertisingToInform getAdvertisingToInformById1(String gId);
    /*
     * @Author Uncle Liu
     * @Description //TODO 添加AdvertisingToInform
     * @Date 18:37 2018/10/30
     **/
    public void addAdvertisingToInform(AdvertisingToInform advertisingToInform);
    /*
     * @Author Uncle Liu
     * @Description //TODO 根据id删除AdvertisingToInform
     * @Date 18:37 2018/10/30
     **/
    public void deleteAdvertisingToInform(String gId);
    /*
     * @Author Uncle Liu
     * @Description //TODO 修改AdvertisingToInform
     * @Date 18:37 2018/10/30
     **/
    public void updateAdvertisingToInform(AdvertisingToInform advertisingToInform);
}
