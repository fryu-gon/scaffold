package com.freyjava.dubbo.base.api;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.freyjava.dubbo.api.BaseApi;
import com.freyjava.dubbo.api.dto.BaseDto;
import com.freyjava.dubbo.api.request.BaseRequest;
import com.freyjava.dubbo.base.biz.BaseBiz;
import com.freyjava.dubbo.base.entity.BaseEntity;
import com.freyjava.dubbo.base.util.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.ParameterizedType;


public abstract class AbstractBaseApi<T extends BaseDto, E extends BaseEntity,
        R extends BaseRequest> implements BaseApi<T, R> {

    @Autowired
    private BaseBiz<T, E> baseBiz;

    public abstract E transfer(R r);

    public abstract void validateCreate(R r);

    public abstract void validateUpdate(R r);

    public abstract void validateQuery(R r);

    @Override
    public Response<T> get(R r) {
        return Response.success(baseBiz.get(r.getId()));
    }

    @Override
    public Response<T> create(R r) {
        validateCreate(r);
        return Response.success(BeanUtils.copyBeans(baseBiz.create(transfer(r)), getTClass()));
    }


    @Override
    public Response<T> update(R r) {
        validateUpdate(r);

        return Response.success(BeanUtils.copyBeans(baseBiz.update(transfer(r)), getTClass()));
    }

    @Override
    public Response<IPage<T>> query(R r) {
        validateQuery(r);
        return Response.success(baseBiz.query(transfer(r), r.getCurPage(), r.getPageSize()));
    }

    @SuppressWarnings("unchecked")
    private Class<T> getTClass() {
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }
}
