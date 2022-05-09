package com.company;

public class Employee {
    private EmployeeType employeeType;
    private static double salary = 800;

    public Employee(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeType=" + employeeType +
                "salary=" + salary +
                '}';
        }
    }