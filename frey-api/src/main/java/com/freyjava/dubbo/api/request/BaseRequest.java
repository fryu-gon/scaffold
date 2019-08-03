package com.freyjava.dubbo.api.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseRequest implements Serializable {

    private static final long serialVersionUID = -261356477514373310L;
    private int curPage;

    private Long id;

    private int pageSize;

    private String operator;
}
