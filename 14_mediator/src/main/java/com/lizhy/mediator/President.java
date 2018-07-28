package com.lizhy.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * NOTE:
 *
 * @author lizhiyang
 * @Date 2018-07-28 14:49
 */
public class President implements Mediator {
    private Map<String, Department> map = new HashMap<String, Department>();
    @Override
    public void redister(String name, Department d) {
        map.put(name, d);
    }

    @Override
    public void command(String name) {
        map.get(name).selfAction();
    }
}
