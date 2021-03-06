package com.sms.mpspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@MapperScan("com.sms.mpspringboot.mapper")
public class MpSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MpSpringbootApplication.class, args);
	}

}
