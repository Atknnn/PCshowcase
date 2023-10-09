package com.ata.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_computerspec")
@Entity
@Builder
@Data
public class ComputersSpec {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    long id;

    long userid;

    String cpu;

    String ram;

    String harddisk;

    String photoid;

    @Embedded
    BaseEntity baseEntity;

}
