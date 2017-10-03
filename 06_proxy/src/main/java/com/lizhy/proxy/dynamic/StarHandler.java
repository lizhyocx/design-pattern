package com.lizhy.proxy.dynamic;

import com.lizhy.proxy.Star;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Note:
 * Created by lizhiyang on 2017-10-03 12:33.
 */
public class StarHandler implements InvocationHandler {
    private Star target;
    public StarHandler(Star target) {
        this.target = target;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj = null;
        System.out.println("真正的方法执行前");
        System.out.println("面谈、签合同、预付款、订机票");
        if(method.getName().equals("sing")) {
            obj =  method.invoke(target, args);
            System.out.println("真正的方法执行后");
            System.out.println("收款");
        }
        return obj;
    }
}
