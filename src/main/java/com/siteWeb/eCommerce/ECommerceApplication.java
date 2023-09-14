package com.siteWeb.eCommerce;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ECommerceApplication {
	@Value("${server.port}")
	public int port;
	public static void main(String[] args) {
		SpringApplication.run(ECommerceApplication.class, args);
		System.out.println("Go to : http://localhost:/"+port);
	}
}
