package com.xakj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.xakj")
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class SpringcloudServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudServer1Application.class, args);
	}
}
