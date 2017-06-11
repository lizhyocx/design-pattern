package com.lizhy;

/**
 * Created by lizhiyang on 2017-06-11 15:14.
 */
public class Car {
    private String engine;
    private String seat;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", seat='" + seat + '\'' +
                '}';
    }
}
