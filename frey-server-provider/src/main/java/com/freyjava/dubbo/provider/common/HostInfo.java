package com.freyjava.dubbo.provider.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/**
 *  Description: 获取机器相关信息:懒加载；线程安全类.
 *  Date: 2017/8/4
 */
public final class HostInfo {
    private static final Logger LOGGER = LoggerFactory.getLogger(HostInfo.class);

    private String localIpAddr = "UnknownHost";
    private String localHostName = "LocalHost";

    private HostInfo() {
        init();
    }

    private void init() {
        try {
            Enumeration<NetworkInterface> allNetInterfaces = NetworkInterface.getNetworkInterfaces();

            while (allNetInterfaces.hasMoreElements()) {
                NetworkInterface netInterface = allNetInterfaces.nextElement();
                Enumeration<InetAddress> addresses = netInterface.getInetAddresses();

                while (addresses.hasMoreElements()) {
                    InetAddress inetAddress = addresses.nextElement();
                    if (inetAddress != null && inetAddress instanceof Inet4Address) {
                        localIpAddr = inetAddress.getHostAddress();
                        localHostName = inetAddress.getHostName();
                        return;
                    }
                }
            }
        } catch (Exception e) {
            LOGGER.warn("Faile to get LocalHost Information ......", e);
        }
    }

    public String getLocalIpAddress() {
        return localIpAddr;
    }

    public String getLocalHostName() {
        return localHostName;
    }

    public static HostInfo getInstance() {
        return ServerInfoHolder.instance;
    }

    private static final class ServerInfoHolder {
        private ServerInfoHolder() {

        }

        private static final HostInfo instance = new HostInfo();
    }
}
