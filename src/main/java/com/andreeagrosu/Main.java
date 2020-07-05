package com.andreeagrosu;

import java.sql.SQLOutput;

public class Main {

    public static void main (String[] args) {

        Office office = new Office();

        EmployeeFactory employeeFactory = new EmployeeFactory();

        Employee salespeople1= employeeFactory.createEmployee("Vasile Ion", GroupName.SALES);

        Employee officeWorker1= employeeFactory.createEmployee("Gheorghe Ion", GroupName.OFFICE);

        Employee groupLead1= employeeFactory.createEmployee("Bogdan Ion", GroupName.GROUPLEAD);

        office.eachMonthSalary(salespeople1);

        office.eachMonthSalary(officeWorker1);

        office.eachMonthSalary(groupLead1);
    }

}
