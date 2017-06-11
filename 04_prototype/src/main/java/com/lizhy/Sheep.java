package com.lizhy;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by lizhiyang on 2017-06-11 15:38.
 */
public class Sheep implements Cloneable, Serializable {
    private String name;
    private Date birthday;
    private Color color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("sheep clone");
        Sheep s = (Sheep) super.clone();
        s.setColor((Color)this.color.clone());//同时克隆其属性
        return s;
    }

}

