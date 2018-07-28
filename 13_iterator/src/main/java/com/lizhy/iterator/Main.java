package com.lizhy.iterator;

/**
 * NOTE:
 *
 * @author lizhiyang
 * @Date 2018-07-28 14:14
 */
public class Main {
    public static void main(String[] args) {
        ConcreteMyAggregate cma = new ConcreteMyAggregate();
        cma.addObject("aa");
        cma.addObject("bb");
        cma.addObject("cc");
        cma.addObject("dd");

        MyIterator iter = cma.createIterator();
        while(iter.hasNext()) {
            System.out.println(iter.getCurrentObject());
            iter.next();
        }
    }
}
