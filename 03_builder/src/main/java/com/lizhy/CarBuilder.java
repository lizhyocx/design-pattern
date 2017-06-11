package com.lizhy;

/**
 * 汽车建造者
 * Created by lizhiyang on 2017-06-11 15:14.
 */
public interface CarBuilder {
    void createEngine(Car car);
    void createSeat(Car car);
}

class AudiCarBuilder implements CarBuilder {

    public void createEngine(Car car) {
        car.setEngine("奥迪高速发动机");
    }

    public void createSeat(Car car) {
        car.setSeat("奥迪舒适座椅");
    }
}
