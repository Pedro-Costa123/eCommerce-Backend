package com.capgemini.pedroC.eCommerce.dao;

import com.capgemini.pedroC.eCommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
