package com.freyjava.dubbo.base.entity;


import lombok.Data;

import java.util.Date;

@Data
public class BaseEntity {
   private Long id;

   private Date createdTime;

   private Date modifiedTime;

   private boolean deleted;

   private String modifier;

   private String creator;
}
