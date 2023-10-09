package com.ata.repository;

import com.ata.repository.entity.Post;
import com.ata.utility.MyFactoryRepository;

public class PostRepository extends MyFactoryRepository <Post,Long> {

    public PostRepository( ) {
        super(new Post());
    }
}
