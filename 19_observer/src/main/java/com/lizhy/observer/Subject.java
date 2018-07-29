package com.lizhy.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * NOTE: 目标对象
 *
 * @author lizhiyang
 * @Date 2018-07-29 13:58
 */
public class Subject {
    //观察者对象
    private List<Observer> list = new ArrayList<Observer>();

    public void register(Observer observer) {
        list.add(observer);
    }

    public void notifyAllObserver() {
        for(Observer observer : list) {
            observer.update(this);
        }
    }
}

class ConcreteSubject extends Subject {
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        //状态发生变化时，通知所有注册的观察者对象
        this.notifyAllObserver();
    }
}
