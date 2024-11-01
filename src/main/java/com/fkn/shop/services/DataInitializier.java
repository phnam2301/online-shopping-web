package com.fkn.shop.services;

import com.fkn.shop.entities.Feature;
import com.fkn.shop.entities.Role;
import com.fkn.shop.entities.RoleFeature;
import com.fkn.shop.repositories.FeatureRepository;
import com.fkn.shop.repositories.RoleFeatureRepository;
import com.fkn.shop.repositories.RoleRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DataInitializier {
    private final RoleRepository roleRepository;
    private final FeatureRepository featureRepository;
    private final RoleFeatureRepository roleFeatureRepository;

    @PostConstruct
    public void initData() {
        // Tạo và lưu các Role
        Role admin = Role.builder().name("ADMIN").build();
        roleRepository.save(admin);

        Role marketing = Role.builder().name("MARKETING").build();
        roleRepository.save(marketing);

        Role saleR = Role.builder().name("SALE").build();
        roleRepository.save(saleR);

        Role customer = Role.builder().name("CUSTOMER").build();
        roleRepository.save(customer);

        // Tạo và lưu các Feature
        Feature ad = Feature.builder().name("admin").url("/ad").build();
        featureRepository.save(ad);

        Feature mkt = Feature.builder().name("marketing").url("/mkt").build();
        featureRepository.save(mkt);

        Feature saleF = Feature.builder().name("sale").url("/sale").build();
        featureRepository.save(saleF);

        Feature order = Feature.builder().name("customer").url("/order").build();
        featureRepository.save(order);

        // Tạo và lưu các RoleFeature
        RoleFeature ad_ad = RoleFeature.builder().role(admin).feature(ad).build();
        roleFeatureRepository.save(ad_ad);

        RoleFeature ad_mkt = RoleFeature.builder().role(admin).feature(mkt).build();
        roleFeatureRepository.save(ad_mkt);

        RoleFeature ad_sale = RoleFeature.builder().role(admin).feature(saleF).build();
        roleFeatureRepository.save(ad_sale);

        RoleFeature mkt_mkt = RoleFeature.builder().role(marketing).feature(mkt).build();
        roleFeatureRepository.save(mkt_mkt);

        RoleFeature sale_sale = RoleFeature.builder().role(saleR).feature(saleF).build();
        roleFeatureRepository.save(sale_sale);

        RoleFeature customer_order = RoleFeature.builder().role(customer).feature(order).build();
        roleFeatureRepository.save(customer_order);
    }
}
