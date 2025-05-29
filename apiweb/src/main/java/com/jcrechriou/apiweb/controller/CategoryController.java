package com.jcrechriou.apiweb.controller;

import com.jcrechriou.entity.Category;
import com.jcrechriou.service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService contactService) {
        this.categoryService = contactService;
    }

    @GetMapping
    public List<Category> getAllCategories() {
        return categoryService.getAllContacts();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Category> getUser(@PathVariable Long id) {
        return categoryService.getContactById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Category createCategory(@RequestBody Category category) {
        return categoryService.createCategory(category);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategory(@PathVariable Long id) {
        categoryService.deleteCategory(id);
        return ResponseEntity.noContent().build();
    }
}
