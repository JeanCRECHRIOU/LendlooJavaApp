package com.jcrechriou.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "photos")
public class Photo {
    @Id
    @GeneratedValue
    private Long id;
    private String url; // ou chemin vers stockage local/S3

    @ManyToOne
    private Item item;
}
