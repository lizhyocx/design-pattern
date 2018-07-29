package com.lizhy.memento;

/**
 * NOTE: 源发器类
 *
 * @author lizhiyang
 * @Date 2018-07-29 14:30
 */
public class Emp {
    private String ename;
    private int age;
    private int salary;

    public Emp(String ename, int age, int salary) {
        this.ename = ename;
        this.age = age;
        this.salary = salary;
    }

    public EmpMemento memento() {
        return new EmpMemento(this);
    }

    public void recovery(EmpMemento memento) {
        this.ename = memento.getEname();
        this.age = memento.getAge();
        this.salary = memento.getSalary();
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

    @Override
    public String toString() {
        return "Emp{" +
                "ename='" + ename + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
