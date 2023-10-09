package com.ata.service;

import com.ata.repository.entity.Computer;
import com.ata.repository.ComputerRepository;

import java.util.List;
import java.util.Optional;

public class ComputerService {
    ComputerRepository computerRepository;


    public ComputerService(){
        this.computerRepository = new ComputerRepository();
    }

    public Computer save(Computer computer){
        return computerRepository.save(computer);
    }

    public List<Computer> findAll(){
        return computerRepository.findAll();
    }

    public Optional<Computer> findById(Long id){
        return computerRepository.findById(id);
    }

    public Iterable<Computer> saveAll(Iterable<Computer> entities){
        return computerRepository.saveAll(entities);
    }
    public void delete(Computer entity) {
        computerRepository.delete(entity);
    }
    public void deleteById(Long id) {
        computerRepository.deleteById(id);
    }
    public boolean existById(Long id) {
        return computerRepository.existById(id);
    }
    public List<Computer> findByEntity(Computer entity) {
        return computerRepository.findByEntity(entity);
    }
    public List<Computer> findByColumnNameAndValue(String columnName, String value) {
        return computerRepository.findByColumnNameAndValue(columnName,value);
    }
}
