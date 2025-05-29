package com.jcrechriou.service;

import com.jcrechriou.entity.Reminder;
import com.jcrechriou.repository.ReminderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReminderService {
    private final ReminderRepository reminderRepository;

    public ReminderService(ReminderRepository reminderRepository) {this.reminderRepository = reminderRepository;
    }

    public List<Reminder> getAllReminders() {
        return reminderRepository.findAll();
    }

    public Optional<Reminder> getReminderById(Long id) {
        return reminderRepository.findById(id);
    }

    public Reminder createReminder(Reminder reminder) {
        return reminderRepository.save(reminder);
    }

    public void deleteReminder(Long id) {
        reminderRepository.deleteById(id);
    }
}

