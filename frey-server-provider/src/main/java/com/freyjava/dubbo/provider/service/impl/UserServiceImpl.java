package com.freyjava.dubbo.provider.service.impl;


import com.freyjava.dubbo.base.service.impl.BaseServiceImpl;
import com.freyjava.dubbo.provider.entity.UserEntity;
import com.freyjava.dubbo.provider.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<UserEntity> implements UserService {
}
