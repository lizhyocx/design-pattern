package com.lizhy.state;

/**
 * NOTE: 房间对象
 *
 * @author lizhiyang
 * @Date 2018-07-29 13:36
 */
public class HomeContext {
    //当前状态
    private State state;

    public void changeState(State s) {
        System.out.println("改变状态");
        state = s;
        state.handle();
    }
}
