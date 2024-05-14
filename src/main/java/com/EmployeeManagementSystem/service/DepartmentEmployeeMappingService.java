package com.EmployeeManagementSystem.service;

import com.EmployeeManagementSystem.entity.Department;
import com.EmployeeManagementSystem.entity.DepartmentEmployeeMapping;
import com.EmployeeManagementSystem.repository.DepartmentEmployeeMappingRepository;
import com.EmployeeManagementSystem.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentEmployeeMappingService {

    @Autowired
    private DepartmentEmployeeMappingRepository departmentEmployeeMappingRepository;

    @Autowired
    public DepartmentEmployeeMappingService(DepartmentEmployeeMappingRepository departmentEmployeeMappingRepository) {
        this.departmentEmployeeMappingRepository = departmentEmployeeMappingRepository;
    }

    public DepartmentEmployeeMapping departmentMapping(DepartmentEmployeeMapping departmentEmployeeMapping) {
        return departmentEmployeeMappingRepository.save(departmentEmployeeMapping);
    }
}
