package io.wliamp.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import io.wliamp.shop.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
