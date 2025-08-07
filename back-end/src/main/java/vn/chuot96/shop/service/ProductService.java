package vn.chuot96.shop.service;

import lombok.RequiredArgsConstructor;
import vn.chuot96.shop.entity.Product;
import vn.chuot96.shop.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repo;

    public List<Product> getAll() {
        return repo.findAll();
    }

    public Product insert(Product product) {
        return repo.save(product);
    }
}

