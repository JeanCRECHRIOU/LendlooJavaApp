package com.jcrechriou.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "loans")
public class Loan {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDate startDate;
    private LocalDate expectedReturnDate;
    private boolean returned;

    @ManyToOne
    private User owner; // qui prête

    @ManyToOne
    private Contact contact; // à qui

    @OneToOne(cascade = CascadeType.ALL)
    private Item item;

    @OneToOne(cascade = CascadeType.ALL)
    private Reminder reminder;
}

