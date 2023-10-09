package com.ata.repository;

import com.ata.repository.entity.Photo;
import com.ata.utility.MyFactoryRepository;

public class PhotoRepository extends MyFactoryRepository <Photo,Long> {

    public PhotoRepository( ) {
        super(new Photo());
    }
}
