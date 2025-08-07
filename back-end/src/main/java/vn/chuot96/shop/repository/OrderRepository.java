package vn.chuot96.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.chuot96.shop.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
