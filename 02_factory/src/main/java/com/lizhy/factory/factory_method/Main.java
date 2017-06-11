package com.lizhy.factory.factory_method;

/**
 * Created by lizhiyang on 2017-06-11 14:24.
 */
public class Main {
    public static void main(String[] args) {
        CarFactory audiFactory = new AudiFactory();
        Car audi = audiFactory.createCar();
        audi.run();

        CarFactory bydFactory = new BydFactory();
        Car byd = bydFactory.createCar();
        byd.run();
    }
}
