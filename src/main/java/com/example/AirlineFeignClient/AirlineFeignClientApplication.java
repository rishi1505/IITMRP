package com.example.AirlineFeignClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AirlineFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirlineFeignClientApplication.class, args);
	}

}
