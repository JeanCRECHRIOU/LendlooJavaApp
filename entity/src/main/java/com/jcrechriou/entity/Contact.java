package com.jcrechriou.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "contacts")
public class Contact {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String phone;
    private String email;

    @ManyToOne
    private User user; // propriétaire du contact
}

