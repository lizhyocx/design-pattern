package com.lizhy;

/**
 * 静态内部类
 * Created by lizhiyang on 2017-06-11 13:03.
 */
public class SingletonDemo2 {

    private static class SingletonInstanceClass {
        public static final SingletonDemo2 instance = new SingletonDemo2();
    }

    private SingletonDemo2() {

    }

    public static SingletonDemo2 getInstance() {
        return SingletonInstanceClass.instance;
    }

    public SingletonDemo2 readResolve() throws Exception {
        return SingletonInstanceClass.instance;
    }
}
