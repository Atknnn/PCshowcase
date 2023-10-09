package com.ata.repository;

import com.ata.repository.entity.ComputersSpec;
import com.ata.utility.MyFactoryRepository;

public class ComputerSpecRepository extends MyFactoryRepository<ComputersSpec,Long> {

    public ComputerSpecRepository( ) {

        super(new ComputersSpec());
    }
}
