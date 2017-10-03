package com.lizhy.proxy;

import com.lizhy.proxy.Star;

/**
 * Note: 真实类
 * Created by lizhiyang on 2017-10-03 12:23.
 */
public class RealStar implements Star {
    public void confer() {
        System.out.println("RealStar.confer()");
    }

    public void signContract() {
        System.out.println("RealStar.signContract");
    }

    public void bookTicket() {
        System.out.println("RealStar.bookTicket()");
    }

    public void sing() {
        System.out.println("RealStar.sing()");
    }

    public void collectMoney() {
        System.out.println("RealStar.collectMoney()");
    }
}
