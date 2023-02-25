package com.smart.resturant;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest(classes = ResturantApplication.class)
class ResturantApplicationTests {
    @Autowired //自动装配对象
    private DataSource dataSource;

	@Test
	void contextLoads() {
	}

    /**
     * 数据库连接池：
     * 1、DBCP
     * 2、C3P0
     * 3、Hikari：SpringBoot默认内部整合的连接池，号称世界上最快的连接池。用来管理数据库的连接对象
     * HikariProxyConnection@182124057 wrapping com.mysql.cj.jdbc.ConnectionImpl@4afd65fd
     * @throws SQLException
     */
    @Test
    void getConnection() throws SQLException {
        System.out.println(dataSource.getConnection());
    }
}
