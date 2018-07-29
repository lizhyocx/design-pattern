package com.lizhy.memento;

/**
 * NOTE: 负责人类
 *
 * @author lizhiyang
 * @Date 2018-07-29 14:33
 */
public class CareTaker {
    //如果需要保存多次，可以通过容器保存备忘录对象（将备忘点压栈）
    private EmpMemento memento;

    public EmpMemento getMemento() {
        return memento;
    }

    public void setMemento(EmpMemento memento) {
        this.memento = memento;
    }
}
