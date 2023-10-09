package com.ata.controller;

import com.ata.repository.entity.Like;
import com.ata.service.LikeService;
import com.ata.utility.Constants;

import java.util.List;
import java.util.Optional;

public class LikeController {


    LikeService likeService;

    public LikeController(){
        this.likeService = new LikeService();
    }

    public Like save(Like like){
        return likeService.save(like);
    }

    public List<Like> findAll(){
        return likeService.findAll();
    }

    public Optional<Like> findById(Long id){
        return likeService.findById(id);
    }

    public Iterable<Like> saveAll(Iterable<Like> entities){
        return likeService.saveAll(entities);
    }
    public void delete(Like entity) {
        likeService.delete(entity);
    }
    public void deleteById(Long id) {
        likeService.deleteById(id);
    }
    public boolean existById(Long id) {
        return likeService.existById(id);
    }
    public List<Like> findByEntity(Like entity) {
        return likeService.findByEntity(entity);
    }
    public List<Like> findByColumnNameAndValue(String columnName, String value) {
        return likeService.findByColumnNameAndValue(columnName,value);
    }

    public void Likeyap(Long postid,Long userid){
        Like like = Like.builder()
                .baseEntity(Constants.getBaseEntity())
                .postid(postid)
                .userid(userid)
                .build();

        save(like);


    }
}






