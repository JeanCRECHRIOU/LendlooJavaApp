package com.jcrechriou.service;

import com.jcrechriou.entity.Loan;
import com.jcrechriou.entity.Photo;
import com.jcrechriou.repository.PhotoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhotoService {
    private final PhotoRepository photoRepository;

    public PhotoService(PhotoRepository photoRepository) {
        this.photoRepository = photoRepository;
    }

    public List<Photo> getAllPhotos() {
        return photoRepository.findAll();
    }

    public Optional<Photo> getPhotoById(Long id) {
        return photoRepository.findById(id);
    }

    public Photo createPhoto(Photo photo) {
        return photoRepository.save(photo);
    }
    public void deletePhoto(Long id) {
        photoRepository.deleteById(id);
    }
}

