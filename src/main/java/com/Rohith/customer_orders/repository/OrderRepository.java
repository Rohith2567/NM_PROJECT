package com.Rohith.customer_orders.repository;

import com.Rohith.customer_orders.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Rohith B
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
