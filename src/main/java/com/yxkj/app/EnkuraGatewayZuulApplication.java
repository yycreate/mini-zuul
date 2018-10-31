package com.yxkj.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@ComponentScan(basePackages = {"com.yxkj.config"})
public class EnkuraGatewayZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnkuraGatewayZuulApplication.class, args);
	}
}
