package com.freyjava.dubbo.base.biz.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.freyjava.dubbo.base.api.dto.BaseDto;
import com.freyjava.dubbo.base.biz.BaseBiz;
import com.freyjava.dubbo.base.entity.BaseEntity;
import com.freyjava.dubbo.base.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class AbstractBaseBizImpl<T extends BaseDto, E extends BaseEntity> implements BaseBiz<T, E> {
    @Autowired
    private BaseService<E> baseService;

    private final QueryWrapper<E> queryWrapper = new QueryWrapper<>();

    private final UpdateWrapper<E> updateWrapper = new UpdateWrapper<>();

    private final Page<E> page = new Page<>();

    public abstract T performGet(E e);

    @Override
    public T get(Long id) {
        return performGet(baseService.get(id));
    }

    public abstract IPage<T> performQuery(IPage<E> iPage);

    public abstract List<T> performQuery(List<E> tList);

    @Override
    public IPage<T> query(E e, int curPage, int pageSize) {
        queryWrapper.setEntity(e);
        page.setCurrent(curPage);
        page.setSize(pageSize);
        return performQuery(baseService.query(queryWrapper, page));
    }

    @Override
    public List<T> query(E e) {
        queryWrapper.setEntity(e);
        return performQuery(baseService.query(queryWrapper));
    }

    public abstract E performCreate(E e);

    @Override
    public E create(E e) {
        baseService.create(performCreate(e));
        return e;
    }

    public abstract E performUpdate(E e);


    @Override
    public E update(E e) {
        e = performUpdate(e);//更新实际测试时注意修改
        updateWrapper.setEntity(e);
        baseService.update(e, updateWrapper);
        return e;
    }
}
