package com.examplo.demo.folhapgto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class HrFolhapgtoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrFolhapgtoApplication.class, args);
	}

}
