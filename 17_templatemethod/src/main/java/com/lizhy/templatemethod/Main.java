package com.lizhy.templatemethod;

/**
 * NOTE:
 *
 * @author lizhiyang
 * @Date 2018-07-29 13:13
 */
public class Main {
    public static void main(String[] args) {
        BankTemplateMethod m1 = new TakeMoney();
        m1.process();

        BankTemplateMethod m2 = new BankTemplateMethod() {
            @Override
            protected void transat() {
                System.out.println("我要存钱");
            }
        };
        m2.process();
    }
}

class TakeMoney extends BankTemplateMethod {

    @Override
    protected void transat() {
        System.out.println("我要取钱");
    }
}
