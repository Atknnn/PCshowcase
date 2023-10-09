package com.ata.service;

import com.ata.repository.entity.Post;
import com.ata.repository.PostRepository;

import java.util.List;
import java.util.Optional;

public class PostService {

    PostRepository postRepository;


    public PostService(){
        this.postRepository = new PostRepository();
    }

    public Post save(Post post){
        return postRepository.save(post);
    }

    public List<Post> findAll(){
        return postRepository.findAll();
    }

    public Optional<Post> findById(Long id){
        return postRepository.findById(id);
    }

    public Iterable<Post> saveAll(Iterable<Post> entities){
        return postRepository.saveAll(entities);
    }
    public void delete(Post entity) {
        postRepository.delete(entity);
    }
    public void deleteById(Long id) {
        postRepository.deleteById(id);
    }
    public boolean existById(Long id) {
        return postRepository.existById(id);
    }
    public List<Post> findByEntity(Post entity) {
        return postRepository.findByEntity(entity);
    }
    public List<Post> findByColumnNameAndValue(String columnName, String value) {
        return postRepository.findByColumnNameAndValue(columnName,value);
    }
}



