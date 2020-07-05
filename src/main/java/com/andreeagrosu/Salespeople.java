package com.andreeagrosu;

import java.util.Random;

public class Salespeople extends Employee {

    Random random = new Random();

    public Salespeople(String name, GroupName groupName) {
        super(name, groupName);
    }

    @Override
    public double calculateSalary() {
        monthlySalary = 1500+(int)(random.nextFloat()*(2000-1500));
        return monthlySalary;
    }

}
