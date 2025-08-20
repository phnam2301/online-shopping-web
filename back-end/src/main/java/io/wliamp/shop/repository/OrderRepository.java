package io.wliamp.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import io.wliamp.shop.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
