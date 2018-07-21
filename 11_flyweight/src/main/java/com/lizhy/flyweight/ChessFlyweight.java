package com.lizhy.flyweight;

/**
 * NOTE: 抽象享元类（棋子）
 *
 * @author lizhiyang
 * @Date 2018-07-21 17:30
 */
public interface ChessFlyweight {
    String getColor();
    void display(Coordinate c);
}

/**
 *  具体享元类
 */
class ConcreteChess implements ChessFlyweight {
    public ConcreteChess(String color) {
        this.color = color;
    }

    private String color;

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate c) {
        System.out.println("棋子颜色："+color+",位置：x="+c.getX()+",y="+c.getY());
    }
}
