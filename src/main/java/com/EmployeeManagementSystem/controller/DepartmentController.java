package com.EmployeeManagementSystem.controller;

import com.EmployeeManagementSystem.entity.Department;
import com.EmployeeManagementSystem.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.management.AttributeNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }
    //**
    // This api is used to both save and update department
    // */
    @PostMapping("/save")
    public ResponseEntity<Department> createDepartment(@RequestBody Department department) {
        Department createdDepartment = departmentService.createDepartment(department);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdDepartment);
}

@DeleteMapping("/{id}")
    public String deleteDepartment(@PathVariable long id)throws AttributeNotFoundException{
       return departmentService.deleteDepartment(id);

    }
    @PostMapping("/list")
    public List<Department> list(){
        return departmentService.fetchDepartment();
    }

    @GetMapping("/view/{id}")
    public Department getDepartment(@PathVariable long id)throws AttributeNotFoundException{
        return departmentService.findById(id);

    }
}
