package com.jcrechriou.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "reminders")
public class Reminder {
    @Id
    @GeneratedValue
    private Long id;
    private String mode; // "email", "notification", "sms", etc.
    private LocalDate reminderDate;
    private Integer frequencyInDays; // si récurrent

    @OneToOne(mappedBy = "reminder")
    private Loan loan;
}
