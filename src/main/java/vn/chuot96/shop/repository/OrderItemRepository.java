package vn.chuot96.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.chuot96.shop.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
