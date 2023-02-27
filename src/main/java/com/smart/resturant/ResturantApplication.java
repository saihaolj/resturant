package com.smart.resturant;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// MapperScan注解指定当前项目中Mapper接口路径的位置，在项目启动时，会自动加载所有的接口
@MapperScan("com.smart.resturant.mapper")
public class ResturantApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResturantApplication.class, args);
	}

}
