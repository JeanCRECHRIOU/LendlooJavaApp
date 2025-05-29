package com.jcrechriou.repository;

import com.jcrechriou.entity.Reminder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReminderRepository extends JpaRepository<Reminder, Long> {
    // Pas besoin d'implémentation, Spring Data JPA s'en charge
}
