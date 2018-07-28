package com.lizhy.command;

/**
 * NOTE:
 *
 * @author lizhiyang
 * @Date 2018-07-28 17:32
 */
public class Main {
    public static void main(String[] args) {
        Command command = new ConcreteCommand(new Receiver());
        Invoker invoker = new Invoker(command);
        invoker.call();
    }
}
