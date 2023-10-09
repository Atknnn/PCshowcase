package com.ata.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_computer")
@Entity
@Builder
@Data
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    long id;

    long userid;

    long postid;

    long computerspedid;

    String computerName;


    @Embedded
    BaseEntity baseEntity;

}
