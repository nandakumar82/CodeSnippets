package com.nanda.algorithms;

import java.util.Objects;

public class Employee {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (empId != employee.empId) return false;
        return Name != null ? Name.equals(employee.Name) : employee.Name == null;
    }

    @Override
    public int hashCode() {
        int result = empId;
        result = 31 * result + (Name != null ? Name.hashCode() : 0);
        return result;
    }

    private int empId;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    private String Name;
}
