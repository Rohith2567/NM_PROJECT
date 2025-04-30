package com.Rohith.customer_orders.repository;

import com.Rohith.customer_orders.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Rohith B
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
