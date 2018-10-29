package xyz.askway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import xyz.askway.pojo.StudentBean;
import xyz.askway.service.CURDService;
import xyz.askway.util.Log4j2Controller;

import javax.annotation.Resource;

/**
 * author:wlm
 * name:
 * function:
 * 2018/10/22 10:12
 */
@Controller
public class StudentController {

    @Resource
    private CURDService curds;

//    @Resource
//    JedisPool jedisPool;

    @Autowired
    private RedisTemplate redisTemplate;


    @RequestMapping("add")
    public ModelAndView addStudent(ModelAndView mav,StudentBean studentBean){
        mav.setViewName("successOrFailure.jsp");
        if (curds.addOne(studentBean)>0){
            mav.addObject("state","success");
        }else mav.addObject("state","failure");
        mav.addObject("stuAll",curds.queryAll());
        try{
//            Jedis jedis=jedisPool.getResource();
//            jedis.set("test","测试");
//            Log4j2Controller.info(jedis.get("test"));
            redisTemplate.opsForValue().set("chen", "陈梓平");
            Log4j2Controller.info("value："+redisTemplate.opsForValue().get("chen"));
        }catch(Exception e){
            e.printStackTrace();
            Log4j2Controller.error("Redis-error");
        }


        Log4j2Controller.error("完成！");
        return mav;
    }

    /**
     * 2018/10/22 14:36
     * #author:wlm
     * #function:查询所有
     * #analysis:
     */
    public ModelAndView queryStudent(ModelAndView mav){

        return mav;
    }




}
