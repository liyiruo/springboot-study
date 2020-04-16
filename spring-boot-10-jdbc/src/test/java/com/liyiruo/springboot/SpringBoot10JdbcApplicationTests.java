package com.liyiruo.springboot;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringBoot10JdbcApplicationTests {

    @Autowired
    DataSource dataSource;

    @Test
    public void contextLoads() {
    }
    @Test
    public void test2() throws SQLException {
		Connection connection = dataSource.getConnection();
		System.out.println(connection.getClass());
    }

}
