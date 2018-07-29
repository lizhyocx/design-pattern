package com.lizhy.memento;

/**
 * NOTE:
 *
 * @author lizhiyang
 * @Date 2018-07-29 14:33
 */
public class Main {
    public static void main(String[] args) {
        Emp e = new Emp("张三", 18, 1600);
        System.out.println("第一次打印对象："+e);
        CareTaker taker = new CareTaker();
        taker.setMemento(e.memento());

        e.setAge(28);
        e.setSalary(5800);
        System.out.println("第二次打印对象："+e);

        e.recovery(taker.getMemento());
        System.out.println("第三次打印对象："+e);
    }
}
