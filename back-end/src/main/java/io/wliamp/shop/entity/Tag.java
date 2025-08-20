package io.wliamp.shop.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tags")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    private String code;

    private String name;

    @ManyToMany(mappedBy = "categories")
    private Set<Product> categories = new HashSet<>();

    @ManyToMany(mappedBy = "flags")
    private Set<Product> flags = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "permission",
            joinColumns = @JoinColumn(name = "role"),
            inverseJoinColumns = @JoinColumn(name = "feature")
    )
    private Set<Tag> permission;
}
