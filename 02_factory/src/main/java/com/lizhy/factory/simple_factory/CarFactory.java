package com.lizhy.factory.simple_factory;

/**
 * Created by lizhiyang on 2017-06-11 14:07.
 */
public class CarFactory {
    public Car createCar(String type) {
        if("奥迪".equals(type)) {
            return new Audi();
        } else if("比亚迪".equals(type)) {
            return new Byd();
        } else {
            return null;
        }
    }

    public static Car createAudi() {
        return new Audi();
    }

    public static Car createByd() {
        return new Byd();
    }

    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        Car audi = factory.createCar("奥迪");
        audi.run();
        Car byd = factory.createCar("比亚迪");
        byd.run();
    }
}
