package com.Rohith.customer_orders.model;

import com.Rohith.customer_orders.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author Rohith B
 */

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role; // ADMIN, CUSTOMER

    public String getUsername() { return username; }

    public String getPassword() { return password; }

    public Role getRole() { return role; }

    public void setUsername(String username) { this.username = username; }

    public void setPassword(String password) { this.password = password; }

    public void setRole(Role role) { this.role = role; }

}
