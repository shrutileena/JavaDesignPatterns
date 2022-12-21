package org.example;

public class Client {
    public static void main(String[] args) {
        Stafflist stafflist = new Stafflist();
        System.out.println("Total amount paid to staff: "+stafflist.getSalary());
        stafflist.accept(new SalaryAdjustmentVisitor());
        System.out.println("New total amount paid to staff: "+stafflist.getSalary());
    }
}