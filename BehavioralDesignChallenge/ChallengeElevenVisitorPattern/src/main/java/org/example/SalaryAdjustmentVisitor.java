package org.example;

public class SalaryAdjustmentVisitor implements Visitor{
    @Override
    public void visit(Manager manager) {
        manager.setSalary(65000);
    }

    @Override
    public void visit(Salesperson salesperson) {
        salesperson.setSalary(50000);
    }

    @Override
    public void visit(Stafflist stafflist) {
        System.out.println("Salary adjustments have been applied for all staff");
    }
}
