package com.lizhy.templatemethod;

/**
 * NOTE:
 *
 * @author lizhiyang
 * @Date 2018-07-29 13:11
 */
public abstract class BankTemplateMethod {
    protected void takeOrder() {
        System.out.println("取号排队");
    }

    protected abstract void transat();

    protected void evaluate() {
        System.out.println("反馈评分");
    }

    /**
     * 模板方法
     */
    public void process() {
        takeOrder();
        transat();
        evaluate();
    }
}
