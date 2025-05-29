package com.jcrechriou.apiweb.controller;

import com.jcrechriou.entity.Photo;
import com.jcrechriou.service.PhotoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/photos")
public class PhotoController {

    private final PhotoService photoService;

    public PhotoController(PhotoService contactService) {
        this.photoService = contactService;
    }

    @GetMapping
    public List<Photo> getAllPhotoss() {
        return photoService.getAllPhotos();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Photo> getPhoto(@PathVariable Long id) {
        return photoService.getPhotoById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Photo createPhoto(@RequestBody Photo photo) {
        return photoService.createPhoto(photo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePhoto(@PathVariable Long id) {
        photoService.deletePhoto(id);
        return ResponseEntity.noContent().build();
    }
}
