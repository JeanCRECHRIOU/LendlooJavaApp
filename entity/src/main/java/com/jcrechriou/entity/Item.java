package com.jcrechriou.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;

    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL)
    private List<Photo> photos;

    @OneToOne(mappedBy = "item")
    private Loan loan;
}

