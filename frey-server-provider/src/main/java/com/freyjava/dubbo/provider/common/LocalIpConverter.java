package com.freyjava.dubbo.provider.common;


import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

public class LocalIpConverter extends ClassicConverter {

    /**
     * <b>Description.: Logback 日志配置使用，目的是获取本机IP地址.</b><br>
     * <b>Date:</b> 2017-08-04
     */
    @Override
    public String convert(ILoggingEvent event) {
        return HostInfo.getInstance().getLocalIpAddress();
    }
}
