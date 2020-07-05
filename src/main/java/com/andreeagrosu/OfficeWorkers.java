package com.andreeagrosu;

import java.util.Random;

public class OfficeWorkers extends Employee {

    Random random = new Random();

    public OfficeWorkers(String name, GroupName groupName) {
        super(name, groupName);
    }

    public boolean isJunior() {
        return random.nextBoolean();
    }

    @Override
    public double calculateSalary() {
        if (isJunior()) {
            monthlySalary=1250;
        } else {
            monthlySalary=1700;
        }
        return monthlySalary;
    }
}
