package com.lizhy.mediator;

/**
 * NOTE:
 *
 * @author lizhiyang
 * @Date 2018-07-28 14:50
 */
public class Main {
    public static void main(String[] args) {
        Mediator president = new President();
        Development development = new Development(president);
        Finacial finacial = new Finacial(president);
        Market market = new Market(president);

        System.out.println("市场部工作。。。。。");
        market.selfAction();
        market.outAction();

        System.out.println("财务部工作。。。。。");
        finacial.selfAction();
        finacial.outAction();

        System.out.println("研发部工作。。。。。");
        development.selfAction();
        development.outAction();

    }
}
