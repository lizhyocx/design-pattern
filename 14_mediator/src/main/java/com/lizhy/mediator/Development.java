package com.lizhy.mediator;

/**
 * NOTE:
 *
 * @author lizhiyang
 * @Date 2018-07-28 14:45
 */
public class Development implements Department {
    private Mediator m;

    public Development(Mediator m) {
        this.m = m;
        this.m.redister("development", this);
    }

    @Override
    public void selfAction() {
        System.out.println("专心研发");
    }

    @Override
    public void outAction() {
        System.out.println("需要资金支持");
        m.command("finacial");
    }
}
