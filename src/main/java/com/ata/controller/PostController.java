package com.ata.controller;

import com.ata.repository.entity.Post;
import com.ata.service.PostService;
import com.ata.utility.Constants;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class PostController {

    static PostService postService;


    public PostController(){
        this.postService = new PostService();
    }

    public static Post save(Post post){
        return postService.save(post);
    }

    public static List<Post> findAll(){
        return postService.findAll();
    }

    public Optional<Post> findById(Long id){
        return postService.findById(id);
    }

    public Iterable<Post> saveAll(Iterable<Post> entities){
        return postService.saveAll(entities);
    }
    public void delete(Post entity) {
        postService.delete(entity);
    }
    public void deleteById(Long id) {
        postService.deleteById(id);
    }
    public boolean existById(Long id) {
        return postService.existById(id);
    }
    public List<Post> findByEntity(Post entity) {
        return postService.findByEntity(entity);
    }
    public List<Post> findByColumnNameAndValue(String columnName, String value) {
        return postService.findByColumnNameAndValue(columnName,value);
    }

    public static void postAt(Long id){
        System.out.print("Post At..");
        String text = new Scanner(System.in).nextLine();
        System.out.println("photo at ...");
        String photo = new Scanner(System.in).nextLine();

        Post post = Post.builder()
                .baseEntity(Constants.getBaseEntity())
                .photourl(photo)
                .userid(id)
                .text(text)
                .build();
        save(post);

    }


}
