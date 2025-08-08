package vn.chuot96.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.chuot96.shop.entity.Product;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    private Product product;
    private int quantity;
}
