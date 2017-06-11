package com.lizhy.factory.abstract_factory;

/**
 * Created by lizhiyang on 2017-06-11 14:54.
 */
public class Main {
    public static void main(String[] args) {
        CarFactory factory = new LowCarFactory();
        Engine e = factory.createEngine();
        Seat s = factory.createSeat();
        e.run();
        s.sit();
    }
}
