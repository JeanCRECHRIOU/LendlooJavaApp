package com.jcrechriou.service;

import com.jcrechriou.entity.Loan;
import com.jcrechriou.repository.LoanRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoanService {
    private final LoanRepository loanRepository;

    public LoanService(LoanRepository categoryRepository) {
        this.loanRepository = categoryRepository;
    }

    public List<Loan> getAllLoans() {
        return loanRepository.findAll();
    }

    public Optional<Loan> getLoanById(Long id) {
        return loanRepository.findById(id);
    }

    public Loan createLoan(Loan category) {
        return loanRepository.save(category);
    }

    public void deleteLoan(Long id) {
        loanRepository.deleteById(id);
    }
}

