package com.EmployeeManagementSystem.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Date dateOfBirth;
    private double salary;
    private String address;
    private String role;
    private Date joiningDate;
    private double yearlyBonusPercentage;

    private Integer manager;

    public Employee() {
    }

    public Employee(String name, Date dateOfBirth, double salary, String address, String role, Date joiningDate,
                    double yearlyBonusPercentage) {
        super();
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
        this.address = address;
        this.role = role;
        this.joiningDate = joiningDate;
        this.yearlyBonusPercentage = yearlyBonusPercentage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public double getYearlyBonusPercentage() {
        return yearlyBonusPercentage;
    }

    public void setYearlyBonusPercentage(double yearlyBonusPercentage) {
        this.yearlyBonusPercentage = yearlyBonusPercentage;
    }



    public Integer getManager() {
        return manager;
    }

    public void setManager(Integer manager) {
        this.manager = manager;
    }
}
