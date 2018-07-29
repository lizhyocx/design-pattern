package com.lizhy.observer;

/**
 * NOTE:
 *
 * @author lizhiyang
 * @Date 2018-07-29 13:58
 */
public interface Observer {
    //状态变化更新
    void update(Subject subject);
}

class ConcreteObserverA implements Observer {

    //要和目标对象state保持一致
    private int myState;

    @Override
    public void update(Subject subject) {
        myState = ((ConcreteSubject)subject).getState();
    }

    public int getMyState() {
        return myState;
    }
}
