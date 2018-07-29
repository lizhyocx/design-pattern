package com.lizhy.state;

/**
 * NOTE:
 *
 * @author lizhiyang
 * @Date 2018-07-29 13:36
 */
public class Main {
    public static void main(String[] args) {
        HomeContext context = new HomeContext();
        context.changeState(new FreeState());
        context.changeState(new BookedState());
        context.changeState(new CheckedInState());
    }
}
