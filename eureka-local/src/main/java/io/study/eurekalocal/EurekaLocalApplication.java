package io.study.eurekalocal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaLocalApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaLocalApplication.class, args);
	}

}
