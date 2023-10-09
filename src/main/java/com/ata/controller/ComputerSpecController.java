package com.ata.controller;

import com.ata.repository.entity.ComputersSpec;
import com.ata.service.ComputerSpecService;
import com.ata.utility.Constants;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ComputerSpecController {


    ComputerSpecService computerSpecService;


    public ComputerSpecController(){
        this.computerSpecService = new ComputerSpecService();
    }

    public ComputersSpec save(ComputersSpec computersSpec){
        return computerSpecService.save(computersSpec);
    }

    public List<ComputersSpec> findAll(){
        return ComputerSpecService.findAll();
    }

    public Optional<ComputersSpec> findById(Long id){
        return computerSpecService.findById(id);
    }

    public Iterable<ComputersSpec> saveAll(Iterable<ComputersSpec> entities){
        return computerSpecService.saveAll(entities);
    }
    public void delete(ComputersSpec entity) {
        computerSpecService.delete(entity);
    }
    public void deleteById(Long id) {
        computerSpecService.deleteById(id);
    }
    public boolean existById(Long id) {
        return computerSpecService.existById(id);
    }
    public List<ComputersSpec> findByEntity(ComputersSpec entity) {
        return computerSpecService.findByEntity(entity);
    }
    public List<ComputersSpec> findByColumnNameAndValue(String columnName, String value) {
        return computerSpecService.findByColumnNameAndValue(columnName,value);
    }
    public void bilesenleriYap(Long userId,Long photoid){

        System.out.print("bileşenleri Yapınız: ");
        String text = new Scanner(System.in).nextLine();

        System.out.println("cpu giriniz");
        String cpu = new Scanner(System.in).nextLine();

        System.out.println("ram giriniz");
        String ram = new Scanner(System.in).nextLine();

        System.out.println("photo url giriniz ");
        String photourl = new Scanner(System.in).nextLine();

        System.out.println("hard disk giriniz ");
        String harddisk = new Scanner(System.in).nextLine();


        ComputersSpec computersSpec = ComputersSpec.builder()
                .cpu(cpu)
                .ram(ram)
                .photoid(photourl)
                .userid(userId)
                .harddisk(harddisk)
                .baseEntity(Constants.getBaseEntity())

                .build();
        save(computersSpec);
    }
}
