package com.freyjava.dubbo.provider.api;


import com.freyjava.dubbo.base.api.impl.AbstractBaseApi;
import com.freyjava.dubbo.base.util.BeanUtils;
import com.freyjava.dubbo.provider.api.dto.UserDto;
import com.freyjava.dubbo.provider.api.request.UserRequest;
import com.freyjava.dubbo.provider.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component("userApi")
public class UserApiImpl extends AbstractBaseApi<UserDto, UserEntity, UserRequest> implements UserApi {


    @Override
    public UserEntity transfer(UserRequest userRequest) {
        return BeanUtils.copyBeans(userRequest, UserEntity.class);
    }

    @Override
    public void validateCreate(UserRequest userRequest) {

    }

    @Override
    public void validateUpdate(UserRequest userRequest) {

    }

    @Override
    public void validateQuery(UserRequest userRequest) {

    }

}
