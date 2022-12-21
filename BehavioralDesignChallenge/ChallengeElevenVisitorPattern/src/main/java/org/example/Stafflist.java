package org.example;

import java.util.ArrayList;

public class Stafflist implements Employee {
    private ArrayList<Employee> salaries = new ArrayList<>();

    public Stafflist(){
        Manager manager= new Manager();
        Salesperson salesperson1 = new Salesperson();
        Salesperson salesperson2 = new Salesperson();
        salaries.add(manager);
        salaries.add(salesperson1);
        salaries.add(salesperson2);
    }

    @Override
    public int getSalary() {
        return salaries.stream().mapToInt(Employee::getSalary).sum();
    }

    @Override
    public void accept(Visitor visitor) {
        salaries.forEach(s->s.accept(visitor));
        visitor.visit(this);
    }
}
