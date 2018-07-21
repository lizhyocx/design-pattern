package com.lizhy.flyweight;

/**
 * NOTE:
 *
 * @author lizhiyang
 * @Date 2018-07-21 17:36
 */
public class Main {
    public static void main(String[] args) {
        ChessFlyweight chess1 = ChessFlyweightFactory.getChess("red");
        ChessFlyweight chess2 = ChessFlyweightFactory.getChess("red");
        ChessFlyweight chess3 = ChessFlyweightFactory.getChess("black");

        System.out.println(chess1);
        System.out.println(chess2);
        System.out.println(chess3);

        chess1.display(new Coordinate(1,2));
        chess2.display(new Coordinate(2,3));
        chess3.display(new Coordinate(3,4));

    }
}
