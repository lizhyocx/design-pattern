package com.lizhy;

import java.io.Serializable;

/**
 * Created by lizhiyang on 2017-06-11 15:52.
 */
class Color implements Cloneable, Serializable {
    private String name;

    public Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("color clone");
        return super.clone();
    }
}
