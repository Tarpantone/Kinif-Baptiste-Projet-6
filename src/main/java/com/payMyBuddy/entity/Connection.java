package com.payMyBuddy.entity;

import com.payMyBuddy.entity.id.ConnectionId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "connection")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Connection {
    @EmbeddedId
    private ConnectionId connectionId;
}
