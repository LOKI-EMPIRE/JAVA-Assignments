package com.examly.springapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Department {

    @Id
    private int departmentId;
    private String departmentName;
    private String departmentEmail;
    private String headOfDepartment;

    public Department(){}

    public Department(int departmentId,String departmentName, String departmentEmail, String headOfDepartment) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentEmail = departmentEmail;
        this.headOfDepartment = headOfDepartment;
    }


    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }  


    public int getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentEmail() {
        return departmentEmail;
    }

    public void setDepartmentEmail(String departmentEmail) {
        this.departmentEmail = departmentEmail;
    }

    public String getHeadOfDepartment() {
        return headOfDepartment;
    }

    public void setHeadOfDepartment(String headOfDepartment) {
        this.headOfDepartment = headOfDepartment;
    }

    
}
