package com.jcrechriou.apiweb.controller;

import com.jcrechriou.entity.Reminder;
import com.jcrechriou.service.ReminderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reminders")
public class ReminderController {

    private final ReminderService reminderService;

    public ReminderController(ReminderService reminderService) {
        this.reminderService = reminderService;
    }

    @GetMapping
    public List<Reminder> getAllReminders() {
        return reminderService.getAllReminders();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Reminder> getUser(@PathVariable Long id) {
        return reminderService.getReminderById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Reminder createReminder(@RequestBody Reminder reminder) {
        return reminderService.createReminder(reminder);
    }

    public ResponseEntity<Void> deleteReminder(@PathVariable Long id) {
            reminderService.deleteReminder(id);
        return ResponseEntity.noContent().build();
    }
}
