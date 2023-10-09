package com.ata.controller;

import com.ata.repository.entity.Computer;
import com.ata.service.ComputerService;
import com.ata.utility.Constants;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ComputerController {

    ComputerService computerService;


    public ComputerController(){
        this.computerService = new ComputerService();
    }

    public Computer save(Computer computer){
        return computerService.save(computer);
    }

    public List<Computer> findAll(){
        return computerService.findAll();
    }

    public Optional<Computer> findById(Long id){
        return computerService.findById(id);
    }

    public Iterable<Computer> saveAll(Iterable<Computer> entities){
        return computerService.saveAll(entities);
    }
    public void delete(Computer entity) {
        computerService.delete(entity);
    }
    public void deleteById(Long id) {
        computerService.deleteById(id);
    }
    public boolean existById(Long id) {
        return computerService.existById(id);
    }
    public List<Computer> findByEntity(Computer entity) {
        return computerService.findByEntity(entity);
    }
    public List<Computer> findByColumnNameAndValue(String columnName, String value) {
        return computerService.findByColumnNameAndValue(columnName,value);
    }
    public void computerYap(Long postid,Long userId){
        System.out.print("Computer Yapınız: ");
        String computerName = new Scanner(System.in).nextLine();


        Computer computer = Computer.builder()
                .postid(postid)
                .userid(userId)
                .computerName(computerName)
                .baseEntity(Constants.getBaseEntity())
                .build();
        save(computer);
    }
}



