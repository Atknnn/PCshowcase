package com.ata.controller;

import com.ata.repository.entity.User;
import com.ata.service.UserService;
import com.ata.utility.Constants;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class UserController {

    UserService userService;


    public UserController(){
        this.userService = new UserService();
    }

    public User save(User user){
        return userService.save(user);
    }

    public List<User> findAll(){
        return userService.findAll();
    }

    public Optional<User> findById(Long id){
        return userService.findById(id);
    }

    public Iterable<User> saveAll(Iterable<User> entities){
        return userService.saveAll(entities);
    }
    public void delete(User entity) {
        userService.delete(entity);
    }
    public void deleteById(Long id) {
        userService.deleteById(id);
    }
    public boolean existById(Long id) {
        return userService.existById(id);
    }
    public List<User> findByEntity(User entity) {
        return userService.findByEntity(entity);
    }
    public List<User> findByColumnNameAndValue(String columnName, String value) {
        return userService.findByColumnNameAndValue(columnName,value);
    }
    public void registerUser(){
        System.out.print("Adınızı Giriniz:  ");
        String name = new Scanner(System.in).nextLine();

        System.out.print("Kullanıcı Adınızı Giriniz:  ");
        String username = new Scanner(System.in).nextLine();

        System.out.print("Parola Giriniz:  ");
        String password = new Scanner(System.in).nextLine();

        System.out.println("email giriniz :");
        String email = new Scanner(System.in).nextLine();


        User user = User.builder()
                .name(name)
                .username(username)
                .password(password)
                .email(email)
                .baseEntity(Constants.getBaseEntity())
                .build();
        save(user);
    }

}


