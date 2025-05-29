package com.jcrechriou.repository;

import com.jcrechriou.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    // Pas besoin d'implémentation, Spring Data JPA s'en charge
}
