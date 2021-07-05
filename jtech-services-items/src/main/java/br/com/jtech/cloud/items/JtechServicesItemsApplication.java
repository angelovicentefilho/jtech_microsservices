package br.com.jtech.cloud.items;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class JtechServicesItemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JtechServicesItemsApplication.class, args);
	}

}
