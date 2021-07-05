package br.com.jtech.cloud.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jtech.cloud.product.entities.Product;
import br.com.jtech.cloud.product.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	private final ProductRepository repository;

	@Autowired
	public ProductServiceImpl(final ProductRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Product> findAll() {
		return this.repository.findAll();
	}

	@Override
	public Product findById(Long id) {
		return this.repository.findById(id).orElseThrow(() -> new RuntimeException("Product not found!"));
	}

}
