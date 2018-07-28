package com.lizhy.mediator;

/**
 * NOTE: 中介者对象
 *
 * @author lizhiyang
 * @Date 2018-07-28 14:44
 */
public interface Mediator {

    void redister(String name, Department d);

    void command(String name);
}
