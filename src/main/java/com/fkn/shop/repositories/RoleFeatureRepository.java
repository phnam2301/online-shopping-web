package com.fkn.shop.repositories;

import com.fkn.shop.entities.RoleFeature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleFeatureRepository extends JpaRepository<RoleFeature, Long> {
}
