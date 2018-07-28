package com.lizhy.mediator;

/**
 * NOTE:
 *
 * @author lizhiyang
 * @Date 2018-07-28 14:48
 */
public class Market implements Department {
    private Mediator m;

    public Market(Mediator m) {
        this.m = m;
        this.m.redister("market", this);
    }

    @Override
    public void selfAction() {
        System.out.println("找项目");
    }

    @Override
    public void outAction() {
        System.out.println("需要研发资源支持");
        m.command("development");
    }
}
