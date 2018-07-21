package com.lizhy.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * NOTE: 享元工厂
 *
 * @author lizhiyang
 * @Date 2018-07-21 17:34
 */
public class ChessFlyweightFactory {
    private static Map<String, ChessFlyweight> map = new HashMap<String, ChessFlyweight>();

    public static ChessFlyweight getChess(String color) {
        ChessFlyweight chess = map.get(color);
        if(chess == null) {
            chess = new ConcreteChess(color);
            map.put(color, chess);
        }
        return chess;
    }
}
