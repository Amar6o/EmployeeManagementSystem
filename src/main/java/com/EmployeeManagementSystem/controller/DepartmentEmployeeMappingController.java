package com.EmployeeManagementSystem.controller;

import com.EmployeeManagementSystem.entity.Department;
import com.EmployeeManagementSystem.entity.DepartmentEmployeeMapping;
import com.EmployeeManagementSystem.repository.DepartmentEmployeeMappingRepository;
import com.EmployeeManagementSystem.service.DepartmentEmployeeMappingService;
import com.EmployeeManagementSystem.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.management.AttributeNotFoundException;
import java.util.List;

@RestController
@RequestMapping("/department-mapping")
public class DepartmentEmployeeMappingController {

    @Autowired
   private DepartmentEmployeeMappingService departmentEmployeeMappingService;

    @PostMapping("/save-department")
    public ResponseEntity<DepartmentEmployeeMapping> departmentMapping(@RequestBody DepartmentEmployeeMapping departmentEmployeeMapping){
        DepartmentEmployeeMapping Mapping= departmentEmployeeMappingService.departmentMapping(departmentEmployeeMapping);
        return ResponseEntity.status(HttpStatus.CREATED).body(Mapping);
    }

}
