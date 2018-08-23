package com.atguigu.credit.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@ComponentScan(basePackages ="com.atguigu.credit")
public class CreditManageWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditManageWebApplication.class, args);
	}
}
