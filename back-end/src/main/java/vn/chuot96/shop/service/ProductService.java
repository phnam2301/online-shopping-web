package vn.chuot96.shop.service;

import lombok.RequiredArgsConstructor;
import vn.chuot96.shop.entity.Product;
import vn.chuot96.shop.exception.ResourceNotFoundException;
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

    public Product getById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found with id: " + id));
    }

    public Product insert(Product product) {
        return repo.save(product);
    }

    public Product update(Long id, Product replace) {
        getById(id);
        Product updated = Product.builder()
                .id(id)
                .name(replace.getName())
                .quantity(replace.getQuantity())
                .price(replace.getPrice())
                .discount(replace.getDiscount())
                .build();
        return repo.save(updated);
    }

    public void remove(Long id) {
        if (!repo.existsById(id)) {
            throw new ResourceNotFoundException("Product not found with id: " + id);
        }
        repo.deleteById(id);
    }
}

