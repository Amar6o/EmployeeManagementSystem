package com.EmployeeManagementSystem.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="department_employee_mapping")
public class DepartmentEmployeeMapping {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    private Integer departmentID;

    private  Integer employeeID;
    public DepartmentEmployeeMapping(Integer departmentID, Integer employeeID) {
        super();
        this.departmentID = departmentID;
        this.employeeID = employeeID;
    }



    public DepartmentEmployeeMapping() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Integer departmentID) {
        this.departmentID = departmentID;
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }
}
