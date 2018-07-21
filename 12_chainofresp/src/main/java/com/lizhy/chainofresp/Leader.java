package com.lizhy.chainofresp;

/**
 * NOTE:
 *
 * @author lizhiyang
 * @Date 2018-07-21 18:02
 */
public abstract class Leader {
    protected String name;
    protected Leader nextLeader;

    public Leader(String name) {
        this.name = name;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    abstract void handleRequest(LeaveRequest request);
}

/**
 * 主任
 */
class Director extends Leader {

    public Director(String name) {
        super(name);
    }

    @Override
    void handleRequest(LeaveRequest request) {
        System.out.println("员工："+request.getEmpName()+"，请假天数："+request.getLeaveDays()+"，请假原因："+request.getReason());
        if(request.getLeaveDays() < 3) {
            System.out.println("主任:"+name+"审批通过");
        } else {
            if(nextLeader != null) {
                System.out.println("主任："+name+"没有权限处理，请求下一级处理");
                nextLeader.handleRequest(request);
            } else {
                System.out.println("主任："+name+"没有下一级");
            }
        }
    }
}

class Manager extends Leader {

    public Manager(String name) {
        super(name);
    }

    @Override
    void handleRequest(LeaveRequest request) {
        System.out.println("员工："+request.getEmpName()+"，请假天数："+request.getLeaveDays()+"，请假原因："+request.getReason());
        if(request.getLeaveDays() >= 3 && request.getLeaveDays() < 10) {
            System.out.println("经理:"+name+"审批通过");
        } else {
            if(nextLeader != null) {
                nextLeader.handleRequest(request);
            } else {
                System.out.println("经理："+name+"没有下一级");
            }
        }
    }
}



