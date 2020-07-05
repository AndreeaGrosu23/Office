package com.andreeagrosu;

public abstract class Employee {

    private String name;
    private int id;
    private static int counter=0;
    private GroupName groupName;
    public double monthlySalary;

    public Employee(String name, GroupName groupName) {
        this.name = name;
        this.groupName = groupName;
        counter++;
        this.id = counter;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public GroupName getGroupName() {
        return groupName;
    }

    public abstract double calculateSalary();

}
