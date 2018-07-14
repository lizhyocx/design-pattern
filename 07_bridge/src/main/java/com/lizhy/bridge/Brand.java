package com.lizhy.bridge;

/**
 * NOTE: 品牌维度
 *
 * @author lizhiyang
 * @Date 2018-07-14 16:48
 */
public interface Brand {
    String getName();
}

class Lenovo implements Brand {
    @Override
    public String getName() {
        return "联想";
    }
}

class Dell implements Brand {

    @Override
    public String getName() {
        return "戴尔";
    }
}


