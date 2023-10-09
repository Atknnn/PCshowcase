package com.ata.service;

import com.ata.repository.ComputerSpecRepository;
import com.ata.repository.entity.ComputersSpec;

import java.util.List;
import java.util.Optional;

public class ComputerSpecService {
    static ComputerSpecRepository computerSpecRepository;


    public ComputerSpecService(){
        this.computerSpecRepository = new ComputerSpecRepository();
    }

    public ComputersSpec save(ComputersSpec computersSpec){
        return computerSpecRepository.save(computersSpec);
    }

    public static List<ComputersSpec> findAll(){
        return computerSpecRepository.findAll();
    }

    public Optional<ComputersSpec> findById(Long id){
        return computerSpecRepository.findById(id);
    }

    public Iterable<ComputersSpec> saveAll(Iterable<ComputersSpec> entities){
        return computerSpecRepository.saveAll(entities);
    }
    public void delete(ComputersSpec entity) {
        computerSpecRepository.delete(entity);
    }
    public void deleteById(Long id) {
        computerSpecRepository.deleteById(id);
    }
    public boolean existById(Long id) {
        return computerSpecRepository.existById(id);
    }
    public List<ComputersSpec> findByEntity(ComputersSpec entity) {
        return computerSpecRepository.findByEntity(entity);
    }
    public List<ComputersSpec> findByColumnNameAndValue(String columnName, String value) {
        return computerSpecRepository.findByColumnNameAndValue(columnName,value);
    }
}


