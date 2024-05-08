package com.examly.springapp;

public class Company {
    
    Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Company [Employee " + employee.toString()+ "]";
    }

    
}
