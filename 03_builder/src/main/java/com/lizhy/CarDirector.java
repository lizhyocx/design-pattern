package com.lizhy;

/**
 * 汽车装配器
 * Created by lizhiyang on 2017-06-11 15:15.
 */
public interface CarDirector {
    /**
     * 装配汽车
     * @return
     */
    Car directCar();
}

class AudiCarDirector implements CarDirector {

    private CarBuilder builder;

    public AudiCarDirector(CarBuilder builder) {
        this.builder = builder;
    }

    public Car directCar() {
        Car car = new Car();
        builder.createEngine(car);
        builder.createSeat(car);
        return car;
    }
}
