package com.freyjava.dubbo.base.biz;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.freyjava.dubbo.api.dto.BaseDto;
import com.freyjava.dubbo.base.entity.BaseEntity;

import java.util.List;

public interface BaseBiz<T extends BaseDto, E extends BaseEntity> {

    /**
     * 获取详细信息
     *
     * @param id 数据库主键
     * @return 根据主键id查询结果
     */
    T get(Long id);


    /**
     * 分页查询信息
     *
     * @param e        查询参数
     * @param curPage  当前页
     * @param pageSize 页码
     * @return 封装好的分页信息 -用于页面展示
     */
    IPage<T> query(E e, int curPage, int pageSize);

    /**
     * 条件查询
     *
     * @param e 查询参数
     * @return 返回list结果集-用于业务处理
     */
    List<T> query(E e);


    /**
     * 创建
     *
     * @param e 创建参数
     * @return 返回带id的结果
     */
    E create(E e);

    /**
     * @param e 无返回值的修改接口
     */
    E update(E e);

}
