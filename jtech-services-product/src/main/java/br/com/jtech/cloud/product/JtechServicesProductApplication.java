package br.com.jtech.cloud.product;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.jtech.cloud.product.entities.Product;
import br.com.jtech.cloud.product.repository.ProductRepository;

@SpringBootApplication
public class JtechServicesProductApplication implements CommandLineRunner {

	@Autowired
	private ProductRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(JtechServicesProductApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Product[] products = { new Product(1L, "Dark Souls 1", 99.5, new Date()),
				new Product(2L, "Dark Souls 2", 199.5, new Date()),
				new Product(3L, "Dark Souls 3", 299.5, new Date()) };
		Arrays.asList(products).forEach(product -> repository.save(product));
	}

}
