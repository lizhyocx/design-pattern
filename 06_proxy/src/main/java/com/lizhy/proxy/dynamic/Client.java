package com.lizhy.proxy.dynamic;

import com.lizhy.proxy.RealStar;
import com.lizhy.proxy.Star;

import java.lang.reflect.Proxy;

/**
 * Note:
 * Created by lizhiyang on 2017-10-03 12:34.
 */
public class Client {
    public static void main(String[] args) {
        Star realStart = new RealStar();
        StarHandler starHandler = new StarHandler(realStart);
        Star proxy = (Star)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, starHandler);
        proxy.sing();

    }
}
