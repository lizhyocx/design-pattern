package com.lizhy.decorator;

/**
 * NOTE:
 *
 * @author lizhiyang
 * @Date 2018-07-14 17:50
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();

        System.out.println("增加新的功能：天上飞");
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();

        System.out.println("增加新的功能：天上飞，水里游");
        WaterCar waterCar = new WaterCar(new FlyCar(car));
        waterCar.move();
    }
}
