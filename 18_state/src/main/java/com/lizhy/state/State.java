package com.lizhy.state;

/**
 * NOTE: 房间对应的状态
 *
 * @author lizhiyang
 * @Date 2018-07-29 13:34
 */
public interface State {
    /**
     * 各个状态自己的处理方法
     */
    void handle();
}

class FreeState implements State {

    @Override
    public void handle() {
        System.out.println("房间空闲，可以预订");
    }
}

class BookedState implements State {

    @Override
    public void handle() {
        System.out.println("房间已被预定");
    }
}

class CheckedInState implements State {

    @Override
    public void handle() {
        System.out.println("房间已入住");
    }
}
