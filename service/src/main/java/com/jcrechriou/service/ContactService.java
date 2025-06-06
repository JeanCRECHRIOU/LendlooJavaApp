package com.jcrechriou.service;

import com.jcrechriou.entity.Contact;
import com.jcrechriou.repository.ContactRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {
    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    public Optional<Contact> getContactById(Long id) {
        return contactRepository.findById(id);
    }

    public Contact createContact(Contact user) {
        return contactRepository.save(user);
    }

    public void deleteContact(Long id) {
        contactRepository.deleteById(id);
    }
}

