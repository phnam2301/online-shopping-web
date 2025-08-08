package vn.chuot96.shop.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.chuot96.shop.entity.Product;
import vn.chuot96.shop.service.ProductService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {
    private final ProductService service;

    @GetMapping
    public List<Product> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping("/insert")
    public Product insert(@RequestBody Product product) {
        return service.insert(product);
    }

    @PostMapping("/update/{id}")
    public Product update(@PathVariable Long id, @RequestBody Product product) {
        return service.update(id, product);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remove(@PathVariable Long id) {
        service.remove(id);
        return ResponseEntity.noContent().build(); // HTTP 204 No Content
    }
}
