package org.example;

public class Manager implements Employee{
    private int salary = 50000;

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
