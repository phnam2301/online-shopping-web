package io.wliamp.shop.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "status")
    private Tag status;

    @NotBlank(message = "Product Name must not be blank")
    private String name;

    @PositiveOrZero(message = "Quantity must be zero or a positive number")
    private int quantity;

    @PositiveOrZero(message = "Price must be zero or a positive number")
    private double price;

    @Min(value = 0, message = "Discount must be at least 0%")
    @Max(value = 100, message = "Discount cannot exceed 100%")
    private int discount;

    @ManyToMany
    @JoinTable(
            name = "product_category",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "category")
    )
    private Set<Tag> categories = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "product_flag",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "flag")
    )
    private Set<Tag> flags = new HashSet<>();
}
