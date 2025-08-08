package vn.chuot96.shop.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vn.chuot96.shop.dto.Cart;
import vn.chuot96.shop.entity.Product;

import java.util.*;

@Service
@RequiredArgsConstructor
public class CartService {
    private final ProductService productService;

    private final Map<Long, Cart> cart = new HashMap<>();

    public List<Cart> getCartItems() {
        return new ArrayList<>(cart.values());
    }

    public void addToCart(Long productId, int quantity) {
        Product product = productService.getById(productId);
        Cart existing = cart.get(productId);
        if (existing != null) {
            existing.setQuantity(existing.getQuantity() + quantity);
        } else {
            cart.put(productId, new Cart(product, quantity));
        }
    }

    public void updateCartItem(Long productId, int quantity) {
        if (!cart.containsKey(productId)) {
            throw new NoSuchElementException("Product not in cart");
        }
        Cart item = cart.get(productId);
        item.setQuantity(quantity);
    }

    public void removeItem(Long productId) {
        cart.remove(productId);
    }

    public void clearCart() {
        cart.clear();
    }
}
