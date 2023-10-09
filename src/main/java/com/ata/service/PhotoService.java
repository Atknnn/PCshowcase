package com.ata.service;

import com.ata.repository.entity.Photo;
import com.ata.repository.PhotoRepository;

import java.util.List;
import java.util.Optional;

public class PhotoService {

    PhotoRepository photoRepository;


    public PhotoService(){
        this.photoRepository = new PhotoRepository();
    }

    public Photo save(Photo photo){
        return photoRepository.save(photo);
    }

    public List<Photo> findAll(){
        return photoRepository.findAll();
    }

    public Optional<Photo> findById(Long id){
        return photoRepository.findById(id);
    }

    public Iterable<Photo> saveAll(Iterable<Photo> entities){
        return photoRepository.saveAll(entities);
    }
    public void delete(Photo entity) {
        photoRepository.delete(entity);
    }
    public void deleteById(Long id) {
        photoRepository.deleteById(id);
    }
    public boolean existById(Long id) {
        return photoRepository.existById(id);
    }
    public List<Photo> findByEntity(Photo entity) {
        return photoRepository.findByEntity(entity);
    }
    public List<Photo> findByColumnNameAndValue(String columnName, String value) {
        return photoRepository.findByColumnNameAndValue(columnName,value);
    }
}

