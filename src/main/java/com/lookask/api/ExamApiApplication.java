package com.lookask.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@MapperScan("com.looask.api.mapper")
//如果不使用MapperScan还可以加mapper上加一个@Mapper的注解，可以达到同样的效果
@SpringBootApplication
public class ExamApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamApiApplication.class, args);
	}

}
