package com.andreeagrosu;

import java.util.Random;

public class GroupLeads extends Employee {

    private static final int baseSalary=1800;
    Random random = new Random();
    private int numberOfEmployeesAssigned;

    public GroupLeads(String name, GroupName groupName) {
        super(name, groupName);
    }

    public int getNumberOfEmployeesAssigned() {
        numberOfEmployeesAssigned = (int)(random.nextFloat()*(23));
        return numberOfEmployeesAssigned;
    }

    public static int getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double calculateSalary() {
        monthlySalary=getBaseSalary()+getNumberOfEmployeesAssigned()*200;
        return monthlySalary;
    }
}
