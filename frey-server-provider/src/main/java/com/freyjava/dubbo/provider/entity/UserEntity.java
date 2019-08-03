package com.freyjava.dubbo.provider.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import com.freyjava.dubbo.base.entity.BaseEntity;
import lombok.Data;

@Data
@TableName("user")
public class UserEntity extends BaseEntity {
    private String email;

    private String name;

    private Integer age;
}
