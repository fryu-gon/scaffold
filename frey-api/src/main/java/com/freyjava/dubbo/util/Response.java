package com.freyjava.dubbo.util;


import java.io.Serializable;

public class Response<T> implements Serializable {
    private static final long serialVersionUID = 2594839399645514260L;

    private T data;

    private boolean success;

    private String code;

    private String message;

    private static final String DEFAULT_SUCCESS_CODE = "200";

    private Response(T data) {
        this.data = data;
        this.code = DEFAULT_SUCCESS_CODE;
        this.success = true;
    }

    private Response(String code, String message) {
        this.success = false;
        this.code = code;
        this.message = message;
    }

    public static <T> Response<T> success(T t) {
        return new Response<>(t);
    }

    public static <T> Response<T> fail(String code, String message) {
        return new Response<>(code, message);
    }

}
