package com.lizhy.command;

/**
 * NOTE:
 *
 * @author lizhiyang
 * @Date 2018-07-28 17:30
 */
public interface Command {
    void execute();
}

class ConcreteCommand implements Command {

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        //可以在接收者执行之前或之后进行一些其他操作
        receiver.action();
    }
}
