package com.savio.myapp.booklendingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableDiscoveryClient
@EnableJpaRepositories(basePackages = "com.savio.myapp.booklendingservice.repo")
@PropertySource(value = "classpath:data.properties")
public class Application 
{
    public static void main( String[] args )
    {
        System.out.println( ">>>>>> Book Lending Services Gets Started...." );
        SpringApplication.run(Application.class, args);
    }
}
