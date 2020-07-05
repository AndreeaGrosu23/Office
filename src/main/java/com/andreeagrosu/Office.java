package com.andreeagrosu;

public class Office {

    Employee employee;
    Months months;

    public void eachMonthSalary(Employee employee) {
        for (Months month:Months.values()) {
            System.out.println("Salary for employee " + employee.getName() + " for month " + month + " is " + employee.calculateSalary());
        }
    }

}
