package com.freyjava.dubbo.base.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.freyjava.dubbo.base.entity.BaseEntity;

public interface BaseDao<E extends BaseEntity> extends BaseMapper<E> {
}
