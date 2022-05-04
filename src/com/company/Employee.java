package com.company;

public class Employee {
    String name;
    String middleName;
    String lastName;
    int dept;
    int salary;
    int id;
    static int counter = 1;

    public Employee(String name, String middleName, String lastName, int salary, int dept) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dept = dept;
        this.salary = salary;
        this.id = counter++;
    }

    public String getName() {
        return this.name;
    }

    public String getMiddleName() {
        return this.name;
    }
    public String getLastName() {
        return this.lastName;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getDept() {
        return this.dept;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
    public void  setDept (int dept){
        this.dept = dept;
    }

    public String toString(){return "Name: " + this.name+ " " +this.middleName+ ", " + "department - " +this.dept+ ", " + "Salary is " +this.salary+ ", "
            +this.id;
    }
}
