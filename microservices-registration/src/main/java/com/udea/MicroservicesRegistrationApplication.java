package com.udea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroservicesRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesRegistrationApplication.class, args);
	}
}
