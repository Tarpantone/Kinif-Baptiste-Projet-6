package com.payMyBuddy.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "bank_account_number")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankAccountNumber {
    @Id
    @Column(name = "account_nb")
    private String accountNB;
}
