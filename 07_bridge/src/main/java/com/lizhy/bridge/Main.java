package com.lizhy.bridge;

/**
 * NOTE:
 *
 * @author lizhiyang
 * @Date 2018-07-14 16:52
 */
public class Main {
    public static void main(String[] args) {
        Brand lenovo = new Lenovo();
        Computer desktop1 = new Desktop(lenovo);
        desktop1.sale();

        Computer laptop1 = new Laptop(lenovo);
        laptop1.sale();
    }
}
