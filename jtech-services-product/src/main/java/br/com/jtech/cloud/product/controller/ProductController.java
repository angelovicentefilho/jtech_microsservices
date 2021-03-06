package br.com.jtech.cloud.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.jtech.cloud.product.entities.Product;
import br.com.jtech.cloud.product.service.ProductService;

@CrossOrigin
@RestController
public class ProductController {

	private final ProductService productService;
	
	@Value("${application.name}")
	private String projectName;

	@Autowired
	public ProductController(final ProductService productService) {
		this.productService = productService;
	}
	
	@GetMapping
	public List<Product> products() {
		return this.productService.findAll();
	}
	
	
	@GetMapping("/{id}")
	public Product getById(@PathVariable Long id) {
		return this.productService.findById(id);
	}
	
	
	@GetMapping("/config")
	public ResponseEntity<String> config() {
		return ResponseEntity.ok(projectName);
	}
}
