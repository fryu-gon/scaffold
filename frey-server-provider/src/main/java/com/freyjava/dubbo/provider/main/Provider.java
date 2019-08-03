package com.freyjava.dubbo.provider.main;

public class Provider {
    public static void main(String[] args) throws Exception {
        try {
            com.alibaba.dubbo.container.Main.main(args);
        } catch (Exception e) {
            System.exit(0);
        }
    }
}
