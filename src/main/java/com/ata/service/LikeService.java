package com.ata.service;


import com.ata.repository.entity.Like;
import com.ata.repository.LikeRepository;

import java.util.List;
import java.util.Optional;

public class LikeService {
    LikeRepository likeRepository;


    public LikeService(){
        this.likeRepository = new LikeRepository();
    }

    public Like save(Like like){
        return likeRepository.save(like);
    }

    public List<Like> findAll(){
        return likeRepository.findAll();
    }

    public Optional<Like> findById(Long id){
        return likeRepository.findById(id);
    }

    public Iterable<Like> saveAll(Iterable<Like> entities){
        return likeRepository.saveAll(entities);
    }
    public void delete(Like entity) {
        likeRepository.delete(entity);
    }
    public void deleteById(Long id) {
        likeRepository.deleteById(id);
    }
    public boolean existById(Long id) {
        return likeRepository.existById(id);
    }
    public List<Like> findByEntity(Like entity) {
        return likeRepository.findByEntity(entity);
    }
    public List<Like> findByColumnNameAndValue(String columnName, String value) {
        return likeRepository.findByColumnNameAndValue(columnName,value);
    }
}






