package com.fideuram.customersatisfaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableCaching(proxyTargetClass = true)
public class CustomerSatisfactionApplicationE 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(CustomerSatisfactionApplicationE.class, args);
    }
}
