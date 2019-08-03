package com.freyjava.dubbo.api.dto;

import lombok.Data;

import java.util.Date;

@Data
public class BaseDto {

    private Long id;

    private Date createdTime;

    private Date modifiedTime;

    private boolean deleted;

    private String modifier;

    private String creator;
}
