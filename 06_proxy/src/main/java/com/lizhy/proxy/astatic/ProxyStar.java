package com.lizhy.proxy.astatic;

import com.lizhy.proxy.Star;

/**
 * Note: 代理类
 * Created by lizhiyang on 2017-10-03 12:24.
 */
public class ProxyStar implements Star {
    private Star realStar;
    public ProxyStar(Star realStar) {
        this.realStar = realStar;
    }
    public void confer() {
        System.out.println("ProxyStar.confer()");
    }

    public void signContract() {
        System.out.println("ProxyStar.signContract()");
    }

    public void bookTicket() {
        System.out.println("ProxyStar.bookTicket()");
    }

    public void sing() {
        realStar.sing();
    }

    public void collectMoney() {
        System.out.println("ProxyStar.collectMoney()");
    }
}
