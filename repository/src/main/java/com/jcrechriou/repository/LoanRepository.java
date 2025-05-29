package com.jcrechriou.repository;

import com.jcrechriou.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {
    // Pas besoin d'implémentation, Spring Data JPA s'en charge
}
