package com.company;

class Employee1{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);
    }

    public int getSalary(){
        return salary;
    }
}

public class cwh_38_custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee1 vansh = new Employee1(); // Instantiating a new Employee Object
        Employee1 axit = new Employee1();  // Instantiating a new Employee Object

        // Setting Attributes for vansh
        vansh.id = 12;
        vansh.salary = 69;
        vansh.name = "vansh gajera";

        // Setting Attributes for axit
        axit.id = 14;
        axit.salary = 60;
        axit.name = "axit gajera";

        // Printing the Attributes
        vansh.printDetails();
        axit.printDetails();
        int salary = axit.getSalary();
        System.out.println(salary);

        // System.out.println(vansh.id);
        // System.out.println(vansh.name);


    }
}
