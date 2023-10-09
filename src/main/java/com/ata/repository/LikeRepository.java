package com.ata.repository;

import com.ata.repository.entity.Like;
import com.ata.utility.MyFactoryRepository;

public class LikeRepository extends MyFactoryRepository<Like,Long> {

    public LikeRepository() {
        super(new Like());
    }
}
