package org.example;

public interface Employee {

    int getSalary();
    void accept(Visitor visitor);
}
