package com.savio.myapp.bookpurchaseservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableDiscoveryClient
@EnableJpaRepositories(basePackages = "com.savio.myapp.bookpurchaseservice.repo")
@PropertySource(value = "classpath:data.properties")
public class Application 
{
    public static void main( String[] args )
    {
        System.out.println( ">>>>>> Book Purchasing Services Gets Started...." );
        SpringApplication.run(Application.class, args);
    }
}
