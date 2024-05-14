package com.EmployeeManagementSystem.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="department")
public class Department {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    private String name;
    private Date createdOn;
    // id of employee table
    private Integer departmentHead;

    public Department() {
    }

    public Department(String name, Date createdOn, Integer departmentHead) {
        super();
        this.name = name;
        this.createdOn = createdOn;
        this.departmentHead= departmentHead;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Integer getDepartmentHead() {
        return departmentHead;
    }

    public void setDepartmentHead(Integer departmentHead) {
        this.departmentHead = departmentHead;
    }
}
