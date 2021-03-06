package com.ljs.dubbo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ljs.dubbo.mapper")
@EnableDubbo
public class GoodsServiceStart {

	public static void main(String[] args) {
		SpringApplication.run(GoodsServiceStart.class, args);
	}
}
