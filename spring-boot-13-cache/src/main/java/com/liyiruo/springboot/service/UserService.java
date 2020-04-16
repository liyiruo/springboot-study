package com.liyiruo.springboot.service;

import com.liyiruo.springboot.entites.User;
import com.liyiruo.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = "user")
public class UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * cacheNames 缓存容器名字
     * key:缓存容器中的key值，方法返回值是value值
     *
     * @param id
     * @return
     */
    @Cacheable(/*cacheNames = "user",*/ key = "#id")
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    //@CachePut(cacheNames = "user",key = "#result.id") //这个也是可以的哦
    @CachePut(/*cacheNames = "user",*/ key = "#user.id")
    public User updateUser(User user) {
        userMapper.updateUser(user);
        return user;
    }

    public Integer addUser(User user) {
        return userMapper.addUser(user);
    }

    /**
     * cacheNames 缓存容器的名称
     * key 在容器中的id
     * allEntries=true 清除缓存时，清除所有。
     * beforeInvocation 执行之前就清除缓存。
     * @param id
     * @return
     */
    @CacheEvict(/*cacheNames = "user",*/key = "#id",allEntries =true,beforeInvocation = false)
    public Integer deleteUser(Integer id) {
        return userMapper.deleteUser(id);
    }
}
