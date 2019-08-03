package com.freyjava.dubbo.provider.api.request;


import com.freyjava.dubbo.base.api.request.BaseRequest;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserRequest extends BaseRequest implements Serializable {
    private static final long serialVersionUID = -105462927834758752L;

    private String name;

    private Integer age;

    private Long id;

    private String email;
}
