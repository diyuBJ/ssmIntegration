import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * author:wlm
 * name:
 * function:
 * 2018/10/26 18:38
 */
public class javaToRedisTest {
    @Test
    public void redisConnectionTest(){
        Jedis jedis= new Jedis("172.20.10.2",6379);
        jedis.set("test","测试");
        System.out.println(jedis.get("test"));

    }

}
