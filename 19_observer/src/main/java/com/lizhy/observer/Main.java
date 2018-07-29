package com.lizhy.observer;

/**
 * NOTE:
 *
 * @author lizhiyang
 * @Date 2018-07-29 14:02
 */
public class Main {
    public static void main(String[] args) {
        //目标对象
        ConcreteSubject subject = new ConcreteSubject();

        //观察者对象
        ConcreteObserverA observer1 = new ConcreteObserverA();
        ConcreteObserverA observer2 = new ConcreteObserverA();
        ConcreteObserverA observer3 = new ConcreteObserverA();

        //将观察者对象注册至目标对象
        subject.register(observer1);
        subject.register(observer2);
        subject.register(observer3);

        //目标对象state发生变化
        subject.setState(200);

        System.out.println(observer1.getMyState());
        System.out.println(observer2.getMyState());
        System.out.println(observer3.getMyState());
    }
}
