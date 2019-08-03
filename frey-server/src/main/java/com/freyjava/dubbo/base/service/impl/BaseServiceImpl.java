package com.freyjava.dubbo.base.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.freyjava.dubbo.base.dao.BaseDao;
import com.freyjava.dubbo.base.entity.BaseEntity;
import com.freyjava.dubbo.base.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseServiceImpl<E extends BaseEntity> implements BaseService<E> {

    @Autowired
    private BaseDao<E> baseDao;

    public E get(Long id) {
        return baseDao.selectById(id);
    }

    public IPage<E> query(QueryWrapper<E> queryWrapper, Page<E> page) {
        return baseDao.selectPage(page, queryWrapper);
    }

    public List<E> query(QueryWrapper<E> queryWrapper) {
        return baseDao.selectList(queryWrapper);
    }

    public int create(E e) {
        return baseDao.insert(e);
    }

    public void update(E e, UpdateWrapper<E> updateWrapper) {
        baseDao.update(e, updateWrapper);
    }
}
