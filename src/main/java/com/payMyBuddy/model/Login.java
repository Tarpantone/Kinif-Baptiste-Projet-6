package com.payMyBuddy.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "login")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Login {
    @Id
    @Column(name = "person_id")
    private int personId;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;
}
