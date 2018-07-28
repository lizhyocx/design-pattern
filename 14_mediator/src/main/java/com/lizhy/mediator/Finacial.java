package com.lizhy.mediator;

/**
 * NOTE:
 *
 * @author lizhiyang
 * @Date 2018-07-28 14:47
 */
public class Finacial implements Department {
    private Mediator m;

    public Finacial(Mediator m) {
        this.m = m;
        this.m.redister("finacial", this);
    }

    @Override
    public void selfAction() {
        System.out.println("资金管理");
    }

    @Override
    public void outAction() {
        System.out.println("发放资金投资");
        m.command("market");
    }
}
