package com.lizhy.strategy;

/**
 * NOTE:负责和具体的策略类交互
 * 这样具体的算法和直接的客户端调用分离了，是的算法可以独立于客户端独立的变化
 *
 * @author lizhiyang
 * @Date 2018-07-28 18:08
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void printPrice(double standardPrice) {
        System.out.println(strategy.getPrice(standardPrice));
    }
}
