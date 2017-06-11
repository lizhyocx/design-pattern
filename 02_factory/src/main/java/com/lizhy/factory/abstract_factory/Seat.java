package com.lizhy.factory.abstract_factory;

/**
 * Created by lizhiyang on 2017-06-11 14:52.
 */
public interface Seat {
    void sit();
}

class LuxurySeat implements Seat {

    public void sit() {
        System.out.println("座椅自动按摩");
    }
}

class LowSeat implements Seat {

    public void sit() {
        System.out.println("座椅不舒服");
    }
}
