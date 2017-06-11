package com.lizhy.factory.factory_method;

/**
 * Created by lizhiyang on 2017-06-11 14:24.
 */
public class BydFactory implements CarFactory {
    public Car createCar() {
        return new Byd();
    }
}
