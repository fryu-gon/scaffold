package com.freyjava.dubbo.api;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.freyjava.dubbo.api.dto.BaseDto;
import com.freyjava.dubbo.api.request.BaseRequest;
import com.freyjava.dubbo.util.Response;


public interface BaseApi<T extends BaseDto, E extends BaseRequest> {

    Response<T> get(E e);

    Response<T> create(E e);

    Response<T> update(E e);

    Response<IPage<T>> query(E e);
}
