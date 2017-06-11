package com.lizhy.factory.factory_method;

/**
 * Created by lizhiyang on 2017-06-11 14:23.
 */
public class AudiFactory implements CarFactory {
    public Car createCar() {
        return new Audi();
    }
}
