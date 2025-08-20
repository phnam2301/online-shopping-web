package io.wliamp.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.wliamp.shop.entity.Product;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    private Product product;
    private int quantity;
}
