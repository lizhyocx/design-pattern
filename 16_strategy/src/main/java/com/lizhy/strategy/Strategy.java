package com.lizhy.strategy;

/**
 * NOTE: 策略类，定义一个策略族
 *
 * @author lizhiyang
 * @Date 2018-07-28 18:05
 */
public interface Strategy {
    double getPrice(double standardPrice);
}

class NewCustomerFewStrategy implements Strategy {

    @Override
    public double getPrice(double standardPrice) {
        System.out.println("不打折");
        return standardPrice;
    }
}

class NewCustomerManyStrategy implements Strategy {

    @Override
    public double getPrice(double standardPrice) {
        System.out.println("打9这");
        return standardPrice * 0.9;
    }
}

class OldCustomerFewStrategy implements Strategy {

    @Override
    public double getPrice(double standardPrice) {
        System.out.println("打85折");
        return standardPrice * 0.85;
    }
}

class OldCustomerManyStrategy implements Strategy {

    @Override
    public double getPrice(double standardPrice) {
        System.out.println("打8折");
        return standardPrice * 0.8;
    }
}
