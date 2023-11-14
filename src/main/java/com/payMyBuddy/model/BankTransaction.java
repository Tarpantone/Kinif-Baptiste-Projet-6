package com.payMyBuddy.model;

import com.payMyBuddy.model.enumeration.OperationEnum;
import com.payMyBuddy.model.id.BankTransactionId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "bank_transaction")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankTransaction {
    @EmbeddedId
    private BankTransactionId bankTransactionId;

    @Column(name = "amount")
    private double amount;

    @Column(name = "operation")
    private OperationEnum operationEnum;

    @Column(name = "description")
    private String description;
}
