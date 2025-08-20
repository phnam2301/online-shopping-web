package io.wliamp.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import io.wliamp.shop.entity.Tag;

public interface TagRepository extends JpaRepository<Tag, Long> {
}
