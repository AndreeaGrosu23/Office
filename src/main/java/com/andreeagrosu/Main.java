package com.andreeagrosu;

public class Main {

    public static void main (String[] args) {

        Office office = new Office();

        EmployeeFactory employeeFactory = new EmployeeFactory();

        Employee salespeople1= employeeFactory.createEmployee("John Grisham", GroupName.SALES);

        Employee officeWorker1= employeeFactory.createEmployee("Amber Daze", GroupName.OFFICE);

        Employee groupLead1= employeeFactory.createEmployee("Dorian McKinley", GroupName.ALL);

        office.computeEachMonthSalary(salespeople1);

        office.computeEachMonthSalary(officeWorker1);

        office.computeEachMonthSalary(groupLead1);
    }

}
