package org.example;

public interface Visitor {
    void visit(Manager manager);
    void visit(Salesperson salesperson);
    void visit(Stafflist stafflist);
}
