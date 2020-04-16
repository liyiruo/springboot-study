package com.liyiruo.springboot.mapper;

import com.liyiruo.springboot.entites.User;
import org.apache.ibatis.annotations.*;

//@Mapper
public interface UserMapper {
    @Select("select*from myuser where id=#{id}")
    User getUserById(Integer id);

    @Update("update myuser set name=#{name}, gander=#{gander},date=#{date} where id=#{id}")
    Integer updateUser(User user);

    @Insert("insert into myuser(gander,name,date) values(#{gander},#{name},#{date})")
    Integer addUser(User user);

    @Delete("delete from myuser where id=#{id};")
    Integer deleteUser(Integer id);
}
