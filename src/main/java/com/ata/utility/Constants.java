package com.ata.utility;

import com.ata.repository.entity.BaseEntity;

public class Constants {

    public static BaseEntity getBaseEntity(){
        return BaseEntity.builder()
                .createat(System.currentTimeMillis())
                .updateat(System.currentTimeMillis())
                .state(true)
                .build();
    }
}
