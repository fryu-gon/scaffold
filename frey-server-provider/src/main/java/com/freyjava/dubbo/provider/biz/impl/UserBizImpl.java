package com.freyjava.dubbo.provider.biz.impl;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.freyjava.dubbo.base.biz.impl.AbstractBaseBizImpl;
import com.freyjava.dubbo.provider.api.dto.UserDto;
import com.freyjava.dubbo.provider.biz.UserBiz;
import com.freyjava.dubbo.provider.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserBizImpl extends AbstractBaseBizImpl<UserDto, UserEntity> implements UserBiz {
    @Override
    public UserDto performGet(UserEntity userEntity) {
        return null;
    }

    @Override
    public IPage<UserDto> performQuery(IPage<UserEntity> iPage) {
        return null;
    }

    @Override
    public List<UserDto> performQuery(List<UserEntity> tList) {
        return null;
    }

    @Override
    public UserEntity performCreate(UserEntity userEntity) {
        return userEntity;
    }

    @Override
    public UserEntity performUpdate(UserEntity userEntity) {
        return null;
    }
}
