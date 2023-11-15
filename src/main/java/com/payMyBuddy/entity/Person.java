package com.payMyBuddy.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "person")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
    @Column(name = "person_id")
    private int personId;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    @OneToOne(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "produit_id")
    private Login login;
    @ManyToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinColumns({
            @JoinColumn(name = "person_id1",referencedColumnName = "personId1"),
            @JoinColumn(name = "person_id2",referencedColumnName = "personId2")
    })
    private List<Connection> connections = new ArrayList<>();

    @ManyToMany(
            fetch = FetchType.LAZY
    )
    @JoinTable(
            name = "assoc_person_bank_account_number",
            joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "account_nb")
    )
    private List<BankAccountNumber> bankAccountNumbers = new ArrayList<>();

    @ManyToMany(
            fetch = FetchType.LAZY
    )
    @JoinTable(
            name = "assoc_person_role",
            joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<Role> roles = new ArrayList<>();

    @ManyToMany(
            fetch = FetchType.LAZY
    )
    @JoinColumns({
            @JoinColumn(name = "sender_id",referencedColumnName = "senderId"),
            @JoinColumn(name = "recipient_id",referencedColumnName = "recipientId")
    })
    private List<ApplicationTransaction> applicationTransactions = new ArrayList<>();
    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "person_id")
    private List<BankTransaction> bankTransactions = new ArrayList<>();
}
