package com.lizhy.command;

/**
 * NOTE:
 *
 * @author lizhiyang
 * @Date 2018-07-28 17:31
 */
public class Invoker {
    //可传入多个Command，进行执行
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void call() {
        command.execute();
    }
}
