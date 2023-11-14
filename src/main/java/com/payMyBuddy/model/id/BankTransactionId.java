package com.payMyBuddy.model.id;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankTransactionId implements Serializable {
    @Column(name = "person_id")
    private int personId;
    @Column(name = "transaction_id")
    private int transactionId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankTransactionId that = (BankTransactionId) o;
        return personId == that.personId && transactionId == that.transactionId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId, transactionId);
    }
}
