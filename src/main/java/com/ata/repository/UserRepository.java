package com.ata.repository;

import com.ata.repository.entity.User;
import com.ata.utility.MyFactoryRepository;

public class UserRepository extends MyFactoryRepository<User,Long> {

    public UserRepository( ) {
        super(new User());


    }
}
