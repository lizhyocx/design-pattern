package com.lizhy.strategy;

/**
 * NOTE:
 *
 * @author lizhiyang
 * @Date 2018-07-28 18:10
 */
public class Main {
    public static void main(String[] args) {
        Strategy s1 = new NewCustomerManyStrategy();
        Context context = new Context(s1);
        context.printPrice(900);
    }
}
