package com.lizhy.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * NOTE:
 *
 * @author lizhiyang
 * @Date 2018-07-14 17:17
 */
public class File implements Leaf {
    private String name;
    public File(String name) {
        this.name = name;
    }
    @Override
    public void operate() {
        System.out.println("我是文件("+name+")");
    }
}

class Folder implements Composite {
    private List<Component> children = new ArrayList<Component>();
    private String name;
    public Folder(String name) {
        this.name = name;
    }
    @Override
    public void operate() {
        System.out.println("我是文件夹("+name+")，我里边有");
        for(Component c : children) {
            c.operate();
        }
        System.out.println("文件夹("+name+")找完了");
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public Component getChild(int index) {
        return children.get(index);
    }

    @Override
    public List<Component> getChildren() {
        return children;
    }
}
