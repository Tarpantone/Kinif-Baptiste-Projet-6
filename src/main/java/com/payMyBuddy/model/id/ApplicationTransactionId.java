package com.payMyBuddy.model.id;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ApplicationTransactionId implements Serializable {
    @Column(name = "sender_id")
    private int senderId;
    @Column(name = "recipient_id")
    private int recipientId;
    @Column(name = "transaction_id")
    private int transactionId;
}

