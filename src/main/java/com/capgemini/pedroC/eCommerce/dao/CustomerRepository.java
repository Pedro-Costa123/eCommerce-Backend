package com.capgemini.pedroC.eCommerce.dao;

import com.capgemini.pedroC.eCommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
