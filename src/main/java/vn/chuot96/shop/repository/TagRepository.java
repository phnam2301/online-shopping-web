package vn.chuot96.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.chuot96.shop.entity.Tag;

public interface TagRepository extends JpaRepository<Tag, Long> {
}