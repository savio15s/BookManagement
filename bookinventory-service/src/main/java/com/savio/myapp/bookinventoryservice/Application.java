package com.savio.myapp.bookinventoryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableJpaRepositories(basePackages = "com.savio.myapp.bookinventoryservice.repo")
@PropertySource(value = "classpath:data.properties")
public class Application 
{
    public static void main( String[] args )
    {
        System.out.println( ">>>>>> Book Inventory Services Gets Started...." );
        SpringApplication.run(Application.class, args);
    }
}
