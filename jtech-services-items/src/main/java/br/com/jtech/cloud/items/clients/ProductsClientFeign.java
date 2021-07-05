package br.com.jtech.cloud.items.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.jtech.cloud.items.protocol.ProductResponse;

//@FeignClient(name = "service-products")
@FeignClient(name = "service-products", url = "http://localhost:8082")
public interface ProductsClientFeign {

	@GetMapping("/products")
	public List<ProductResponse> products();

	@GetMapping("/products/{id}")
	public ProductResponse getById(@PathVariable Long id);
}
