package com.liyiruo.springboot;

import com.liyiruo.springboot.entites.User;
import com.liyiruo.springboot.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class SpringBoot13CacheApplicationTests {
    @Autowired
    StringRedisTemplate stringRedisTemplate;//操作字符串

    @Autowired
    RedisTemplate redisTemplate;//操作复杂类型
    //自定义的json 序列化器
    @Autowired
    RedisTemplate jsonRedisTemplate;
    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void test1() {
		/*
		stringRedisTemplate.opsForValue();
		stringRedisTemplate.opsForList();
		stringRedisTemplate.opsForHash();
		stringRedisTemplate.opsForSet();
		stringRedisTemplate.opsForZSet();
		*/
        stringRedisTemplate.opsForValue().set("mykey", "myvalue");
        String mykey = stringRedisTemplate.opsForValue().get("mykey");

        User user = userService.getUserById(1);//需要user可序列化

        redisTemplate.opsForValue().set("myuser", user);
        Object myuser = redisTemplate.opsForValue().get("myuser");

        jsonRedisTemplate.opsForValue().set("myuser3", user);
        Object myuser2 = jsonRedisTemplate.opsForValue().get("myuser3");
        //设置过期时间
        redisTemplate.expire(1, 2400, TimeUnit.DAYS);
    }

}
