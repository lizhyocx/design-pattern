package com.lizhy;

import java.io.*;
import java.util.Date;

/**
 * Created by lizhiyang on 2017-06-11 15:39.
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Sheep s = new Sheep();
        s.setName("小绵羊");
        s.setBirthday(new Date(12345678));
        s.setColor(new Color("白色"));
        System.out.println(s);
        System.out.println(s.getColor());

        //Sheep cloneSheep = (Sheep) s.clone();

        //使用序列化反序列化克隆对象
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(s);
        byte[] bytes = bos.toByteArray();

        ObjectInputStream bis = new ObjectInputStream(new ByteArrayInputStream(bytes));
        Sheep cloneSheep = (Sheep)bis.readObject();

        //改变原来的对象中的属性，验证浅拷贝和深拷贝
        s.getColor().setName("黑色");
        s.setBirthday(new Date());
        System.out.println(cloneSheep);
        System.out.println(cloneSheep.getName()+" "+cloneSheep.getBirthday()+cloneSheep.getColor().getName());
    }
}
