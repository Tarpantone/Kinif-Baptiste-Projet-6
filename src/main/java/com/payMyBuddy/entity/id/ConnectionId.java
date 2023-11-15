package com.payMyBuddy.entity.id;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class ConnectionId implements Serializable {
    @Column(name = "person_id1")
    private int personId1;
    @Column(name = "person_id2")
    private int personId2;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConnectionId that = (ConnectionId) o;
        return personId1 == that.personId1 && personId2 == that.personId2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId1, personId2);
    }
}
