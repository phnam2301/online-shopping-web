package vn.chuot96.shop.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.chuot96.shop.dto.Cart;
import vn.chuot96.shop.service.CartService;

import java.util.List;

@RestController
@RequestMapping("/cart")
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;

    @GetMapping
    public ResponseEntity<List<Cart>> getCart() {
        return ResponseEntity.ok(cartService.getCartItems());
    }

    @PostMapping("/add")
    public ResponseEntity<String> addToCart(@RequestParam Long productId,
                                            @RequestParam(defaultValue = "1") int quantity) {
        cartService.addToCart(productId, quantity);
        return ResponseEntity.ok("Added to cart");
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateCart(@RequestParam Long productId,
                                             @RequestParam int quantity) {
        cartService.updateCartItem(productId, quantity);
        return ResponseEntity.ok("Cart item updated");
    }

    @DeleteMapping("/remove")
    public ResponseEntity<String> removeFromCart(@RequestParam Long productId) {
        cartService.removeItem(productId);
        return ResponseEntity.ok("Cart item removed");
    }

    @DeleteMapping("/clear")
    public ResponseEntity<String> clearCart() {
        cartService.clearCart();
        return ResponseEntity.ok("Cart cleared");
    }
}
