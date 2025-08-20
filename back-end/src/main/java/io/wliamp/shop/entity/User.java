package io.wliamp.shop.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.sql.Date;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "role")
    private Tag role;

    @ManyToOne
    @JoinColumn(name = "status")
    private Tag status;

    @ManyToOne
    @JoinColumn(name = "gender")
    private Tag gender;

    @NotBlank(message = "Email must not be blank")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Phone number must not be blank")
    @Pattern(
            regexp = "^0\\d{9,10}$",
            message = "Phone number must start with 0 and contain 10 to 11 digits"
    )
    private String phone;

    @NotBlank(message = "Username must not be blank")
    @Pattern(
            regexp = "^[a-zA-Z0-9]{5,20}$",
            message = "Username must be 5-20 characters long and contain only letters and numbers"
    )
    private String username;

    @NotBlank(message = "Password must not be blank")
    @Pattern(
            regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+\\-={}:\";'<>?,./]).{8,}$",
            message = "Password must be at least 8 characters and include lowercase, uppercase, number, and special character"
    )
    private String password;

    @Past(message = "Date of birth must be in the past")
    private Date dob;

    private String firstname;

    private String lastname;

    private String address;
}
