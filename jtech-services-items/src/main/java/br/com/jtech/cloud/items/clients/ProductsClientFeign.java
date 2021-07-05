package br.com.jtech.cloud.items.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.jtech.cloud.items.protocol.ProductResponse;

@FeignClient(name = "service-products")
public interface ProductsClientFeign {

	@GetMapping
	public List<ProductResponse> products();

	@GetMapping("/{id}")
	public ProductResponse getById(@PathVariable Long id);
}
