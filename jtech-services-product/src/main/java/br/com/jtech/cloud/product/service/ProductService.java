package br.com.jtech.cloud.product.service;

import java.util.List;

import br.com.jtech.cloud.product.entities.Product;

public interface ProductService {

	List<Product> findAll();

	Product findById(Long id);

}
