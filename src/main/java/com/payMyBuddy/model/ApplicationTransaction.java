package com.payMyBuddy.model;

import com.payMyBuddy.model.id.ApplicationTransactionId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "application_transaction")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationTransaction {
    @EmbeddedId
    private ApplicationTransactionId applicationTransactionId;

    @Column(name = "amount")
    private double amount;

    @Column(name = "fees")
    private double fees;

    @Column(name = "description")
    private String description;
}
