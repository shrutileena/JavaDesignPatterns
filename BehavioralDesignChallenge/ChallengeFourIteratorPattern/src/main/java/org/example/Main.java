package org.example;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Shruti");
        Employee employee2 = new Employee("Abhay");

        StaffList staffList = new StaffList(employee1, employee2);
        StaffListIterator staffListIterator = staffList.iterator();

        while (staffListIterator.hasNext()){
            System.out.println(staffListIterator.next());
        }
    }
}