package com.jcrechriou.repository;

import com.jcrechriou.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    // Pas besoin d'implémentation, Spring Data JPA s'en charge
}
