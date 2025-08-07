package vn.chuot96.shop.entity;

import jakarta.persistence.*;
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

    private String email;

    private String phone;

    private String username;

    private String password;

    private String firstname;

    private String lastname;

    private Date dob;

    private String address;
}
