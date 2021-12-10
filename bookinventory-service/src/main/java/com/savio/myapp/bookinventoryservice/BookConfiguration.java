package com.savio.myapp.bookinventoryservice;

import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.savio.myapp.bookinventoryservice")
public class BookConfiguration {

    @Bean
	public AlwaysSampler defaultSampler() {
	  return new AlwaysSampler();
	}
    
}
