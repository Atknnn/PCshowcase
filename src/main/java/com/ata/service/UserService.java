package com.ata.service;

import com.ata.repository.entity.User;
import com.ata.repository.UserRepository;

import java.util.List;
import java.util.Optional;

public class UserService {
    UserRepository userRepository;


    public UserService(){
        this.userRepository = new UserRepository();
    }

    public User save(User user){
        return userRepository.save(user);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public Optional<User> findById(Long id){
        return userRepository.findById(id);
    }

    public Iterable<User> saveAll(Iterable<User> entities){
        return userRepository.saveAll(entities);
    }
    public void delete(User entity) {
        userRepository.delete(entity);
    }
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
    public boolean existById(Long id) {
        return userRepository.existById(id);
    }
    public List<User> findByEntity(User entity) {
        return userRepository.findByEntity(entity);
    }
    public List<User> findByColumnNameAndValue(String columnName, String value) {
        return userRepository.findByColumnNameAndValue(columnName,value);
    }
}







