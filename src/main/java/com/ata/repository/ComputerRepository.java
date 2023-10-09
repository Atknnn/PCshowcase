package com.ata.repository;

import com.ata.repository.entity.Computer;
import com.ata.utility.MyFactoryRepository;

public class ComputerRepository extends MyFactoryRepository<Computer,Long> {

    public ComputerRepository() {
        super(new Computer());
    }
}
