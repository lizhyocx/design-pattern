package com.lizhy.decorator;

/**
 * NOTE:
 *
 * @author lizhiyang
 * @Date 2018-07-14 17:46
 */

/**
 * Component抽象构件角色
 */
interface ICar {
    void move();
}

/**
 * ConcreteComponent具体构件角色
 */
public class Car implements ICar {

    @Override
    public void move() {
        System.out.println("地上跑");
    }
}

/**
 * Decorator装饰角色
 */
class SuperCar implements ICar {
    protected ICar car;
    public SuperCar(ICar car) {
        this.car = car;
    }
    @Override
    public void move() {
        car.move();
    }
}

/**
 * ConcreteDecorator：具体装饰角色
 */
class FlyCar extends SuperCar {

    public FlyCar(ICar car) {
        super(car);
    }

    public void fly() {
        System.out.println("天上飞");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}

/**
 * ConcreteDecorator：具体装饰角色
 */
class WaterCar extends SuperCar {

    public WaterCar(ICar car) {
        super(car);
    }

    public void water() {
        System.out.println("水里游");
    }

    @Override
    public void move() {
        super.move();
        water();
    }
}
