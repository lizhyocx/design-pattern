package com.lizhy.iterator;

/**
 * NOTE: 自定义迭代器接口
 *
 * @author lizhiyang
 * @Date 2018-07-28 14:11
 */
public interface MyIterator {
    void first();
    void next();
    void last();
    boolean hasNext();
    Object getCurrentObject();
}
