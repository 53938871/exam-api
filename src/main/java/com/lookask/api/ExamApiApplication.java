package com.lookask.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@MapperScan("com.looask.api.mapper")
//�����ʹ��MapperScan�����Լ�mapper�ϼ�һ��@Mapper��ע�⣬���Դﵽͬ����Ч��
@SpringBootApplication
public class ExamApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamApiApplication.class, args);
	}

}
