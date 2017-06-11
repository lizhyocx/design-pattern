package com.lizhy.factory.abstract_factory;

/**
 * Created by lizhiyang on 2017-06-11 14:51.
 */
public interface Engine {
    void run();
}

class LuxuryEngine implements Engine {

    public void run() {
        System.out.println("发动机转发飞快");
    }
}

class LowEngine implements Engine {

    public void run() {
        System.out.println("发动机转的慢");
    }
}
