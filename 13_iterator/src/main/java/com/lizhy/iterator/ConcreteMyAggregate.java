package com.lizhy.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * NOTE: 自定义集合类
 *
 * @author lizhiyang
 * @Date 2018-07-28 14:10
 */
public class ConcreteMyAggregate {
    private List<Object> list = new ArrayList<Object>();

    public void addObject(Object obj) {
        list.add(obj);
    }

    public MyIterator createIterator() {
        return new MyConcreteIterator();
    }

    private class MyConcreteIterator implements MyIterator {

        private int cursor;

        @Override
        public void first() {
            cursor = 0;
        }

        @Override
        public void next() {
            cursor++;
        }

        @Override
        public void last() {
            cursor = list.size() - 1;
        }

        @Override
        public boolean hasNext() {
            return cursor < list.size();
        }

        @Override
        public Object getCurrentObject() {
            return list.get(cursor);
        }
    }
}
