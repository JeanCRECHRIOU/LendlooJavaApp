package com.jcrechriou.repository;

import com.jcrechriou.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    // Pas besoin d'implémentation, Spring Data JPA s'en charge
}
