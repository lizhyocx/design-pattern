package com.lizhy.memento;

/**
 * NOTE: 备忘录类
 *
 * @author lizhiyang
 * @Date 2018-07-29 14:31
 */
public class EmpMemento {
    private String ename;
    private int age;
    private int salary;

    public EmpMemento(Emp e) {
        this.ename = e.getEname();
        this.age = e.getAge();
        this.salary = e.getSalary();
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
