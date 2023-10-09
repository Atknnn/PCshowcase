package com.ata.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_post")
@Entity
@Builder
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

        long id;

        long userid;

        String photourl;

        String text;

    @Embedded
    BaseEntity baseEntity;

}
