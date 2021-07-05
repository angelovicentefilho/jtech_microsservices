package br.com.jtech.cloud.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jtech.cloud.product.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
