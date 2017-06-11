package com.lizhy;

/**
 * 単例双重检查
 * Created by lizhiyang on 2017-06-11 13:00.
 */
public class SingletonDemo1 {
    private volatile static SingletonDemo1 instance;

    private SingletonDemo1() {

    }

    public static SingletonDemo1 getInstance() {
        if(instance == null) {
            synchronized (SingletonDemo1.class) {
                if(instance == null) {
                    instance = new SingletonDemo1();
                }
            }
        }
        return instance;
    }
}
