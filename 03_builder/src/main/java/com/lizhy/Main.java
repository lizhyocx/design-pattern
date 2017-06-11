package com.lizhy;

/**
 * Created by lizhiyang on 2017-06-11 15:18.
 */
public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new AudiCarBuilder();
        CarDirector director = new AudiCarDirector(builder);
        Car car = director.directCar();
        System.out.println(car);
    }
}
