package com.freyjava.dubbo.base.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.freyjava.dubbo.base.entity.BaseEntity;

import java.util.List;

public interface BaseService<E extends BaseEntity> {
    /**
     * <b>Description:</b>获取详细信息<br>
     *
     * @param id not null
     * @return e
     */
    E get(Long id);

    /**
     * <b>Description:</b>分页查询信息<br>
     *
     * @param queryWrapper not null
     * @param page
     * @return pageModel
     */
    IPage<E> query(QueryWrapper<E> queryWrapper, Page<E> page);

    /**
     * <b>Description:</b>查询信息<br>
     *
     * @param queryWrapper 查询参数
     * @return tList
     */
    List<E> query(QueryWrapper<E> queryWrapper);

    /**
     * <b>Description:</b>添加信息<br>
     *
     * @param e not null
     * @return e
     */
    int create(E e);

    /**
     * <b>Description:</b>修改信息<br>
     *
     * @param e not null
     */
    void update(E e, UpdateWrapper<E> updateWrapper);

}
