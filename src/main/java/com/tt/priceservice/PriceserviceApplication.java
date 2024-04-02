package com.tt.priceservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PriceserviceApplication {
	public static void main(String[] args) {
		SpringApplication.run(PriceserviceApplication.class, args);
	}
}
