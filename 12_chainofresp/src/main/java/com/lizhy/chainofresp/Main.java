package com.lizhy.chainofresp;

/**
 * NOTE:
 *
 * @author lizhiyang
 * @Date 2018-07-21 18:07
 */
public class Main {
    public static void main(String[] args) {
        Leader a = new Director("A");
        Leader b = new Manager("B");
        //组织责任链对象的关系
        a.setNextLeader(b);

        LeaveRequest request1 = new LeaveRequest("张三", 1, "有事");
        a.handleRequest(request1);

        LeaveRequest request2 = new LeaveRequest("李四", 5, "休假");
        a.handleRequest(request2);

        LeaveRequest request3 = new LeaveRequest("王五", 12, "就是想请假");
        a.handleRequest(request3);
    }
}
