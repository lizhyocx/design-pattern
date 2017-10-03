package com.lizhy;

/**
 * Note: 测试用客户端类
 * Created by lizhiyang on 2017-10-03 11:49.
 */
public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.handleRequest();
    }
}
