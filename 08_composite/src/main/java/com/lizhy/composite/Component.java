package com.lizhy.composite;

import java.util.List;

/**
 * NOTE: 抽象组件
 *
 * @author lizhiyang
 * @Date 2018-07-14 17:07
 */
public interface Component {
    void operate();
}

/**
 * 叶子组件
 */
interface Leaf extends Component {

}

/**
 * 容器组件
 */
interface Composite extends Component {
    void add(Component c);
    void remove(Component c);
    Component getChild(int index);
    List<Component> getChildren();
}

