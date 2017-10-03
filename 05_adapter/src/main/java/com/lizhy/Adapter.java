package com.lizhy;

/**
 * Note: 适配器
 * Created by lizhiyang on 2017-10-03 11:51.
 */
public class Adapter implements Target {
    private Adaptee adaptee;
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    public void handleRequest() {
        System.out.println("适配器适配中...");
        adaptee.request();
        System.out.println("适配器适配完成.");
    }
}
