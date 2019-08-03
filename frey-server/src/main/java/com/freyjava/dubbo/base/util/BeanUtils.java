package com.freyjava.dubbo.base.util;


import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class BeanUtils {

    public static <E, T> E copyBeans(T t, Class<E> eClass) {
        E e = null;
        try {
            e = eClass.newInstance();
            org.springframework.beans.BeanUtils.copyProperties(t, e);
        } catch (Exception ex) {
            ex.getMessage();
        }
        return e;
    }

    public static  <E, T> List<E> copyList(List<T> tList, Class<E> eClass) {
        if (CollectionUtils.isEmpty(tList)) {
            return new ArrayList<>();
        }
        List<E> eList = new ArrayList<>();
        tList.forEach(t -> {
            try {
                eList.add(copyBeans(t, eClass));
            } catch (Exception e) {
                e.getMessage();
            }
        });
        return eList;
    }
}
