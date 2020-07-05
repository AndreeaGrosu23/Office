package com.andreeagrosu;

public class EmployeeFactory {

    public static Employee createEmployee (String name, GroupName groupName) {
        if (groupName==GroupName.ALL) {
            return new GroupLeads(name, groupName);
        } else if (groupName==GroupName.SALES) {
            return new Salespeople(name, groupName);
        } else if (groupName==GroupName.OFFICE) {
            return new OfficeWorkers(name, groupName);
        }
        return null;
    }
}
