package com.lizhy.factory.abstract_factory;

/**
 * Created by lizhiyang on 2017-06-11 14:53.
 */
public interface CarFactory {
    Engine createEngine();
    Seat createSeat();
}

class LuxuryCarFactory implements CarFactory {

    public Engine createEngine() {
        return new LuxuryEngine();
    }

    public Seat createSeat() {
        return new LuxurySeat();
    }
}

class LowCarFactory implements CarFactory {

    public Engine createEngine() {
        return new LowEngine();
    }

    public Seat createSeat() {
        return new LowSeat();
    }
}