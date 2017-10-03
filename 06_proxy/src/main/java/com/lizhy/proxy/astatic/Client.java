package com.lizhy.proxy.astatic;

import com.lizhy.proxy.RealStar;
import com.lizhy.proxy.Star;

/**
 * Note:
 * Created by lizhiyang on 2017-10-03 12:26.
 */
public class Client {
    public static void main(String[] args) {
        Star real = new RealStar();
        Star proxy = new ProxyStar(real);
        proxy.confer();
        proxy.signContract();
        proxy.bookTicket();
        proxy.sing();
        proxy.confer();
    }
}
