package com.savio.myapp.discoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Main {

	public static void main(String[] args) {

		System.out.println( "Starting Eureka Server" );
		SpringApplication.run(Main.class, args);
	}

}
