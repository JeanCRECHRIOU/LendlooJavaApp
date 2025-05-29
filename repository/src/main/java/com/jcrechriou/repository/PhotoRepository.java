package com.jcrechriou.repository;

import com.jcrechriou.entity.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoRepository extends JpaRepository<Photo, Long> {
    // Pas besoin d'implémentation, Spring Data JPA s'en charge
}
