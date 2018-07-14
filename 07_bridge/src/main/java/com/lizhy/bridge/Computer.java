package com.lizhy.bridge;

/**
 * NOTE:电脑类型维度
 *
 * @author lizhiyang
 * @Date 2018-07-14 16:50
 */
public abstract class Computer {
    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }
    public abstract void sale();
}

class Desktop extends Computer {

    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        System.out.println("销售"+ brand.getName() +"台式机");
    }
}

class Laptop extends Computer {

    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        System.out.println("销售" + brand.getName() + "笔记本");
    }
}
