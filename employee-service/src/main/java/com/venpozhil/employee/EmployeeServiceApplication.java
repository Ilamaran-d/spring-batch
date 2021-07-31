package com.venpozhil.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableEurekaClient
public class EmployeeServiceApplication {

	
//	@Bean 
//	public RestTemplate getRestTemplate() { 
//		  return new RestTemplate(); 
//	}
	 
	
	@Bean
	@LoadBalanced
	public WebClient.Builder getWebClient() {
		//HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
		//factory.setConnectTimeout(3000);
		return WebClient.builder();
	}
	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

}
