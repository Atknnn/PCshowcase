package com.ata.controller;

import com.ata.repository.entity.Photo;
import com.ata.service.PhotoService;
import com.ata.utility.Constants;

import java.util.Optional;
import java.util.Scanner;

public class PhotoController {

    PhotoService photoService;

    public PhotoController(){
        this.photoService = new PhotoService();
    }
    public Photo save(Photo photo){
        return photoService.save(photo);
    }
    public Optional<Photo> findById(Long id){
        return photoService.findById(id);
    }
    public Iterable<Photo> saveAll(Iterable<Photo> entities){
        return photoService.saveAll(entities);
    }
    public void delete(Photo entity) {
        photoService.delete(entity);
    }
    public void deleteById(Long id) {
        photoService.deleteById(id);
    }
    public boolean existById(Long id) {
        return photoService.existById(id);
    }



    public void photoat(Long id){

        System.out.println("resim url giriniz");
        String photourl = new Scanner(System.in).nextLine();


        Photo photo = Photo.builder()
                .baseEntity(Constants.getBaseEntity())
                .id(id)
                .photourl(photourl)
                .build();

        save(photo);


    }
}
