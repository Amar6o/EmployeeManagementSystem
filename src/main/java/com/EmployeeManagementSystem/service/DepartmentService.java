package com.EmployeeManagementSystem.service;

import com.EmployeeManagementSystem.entity.Department;
import com.EmployeeManagementSystem.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department createDepartment(Department department) {
        department.setCreatedOn(new Date());
        return departmentRepository.save(department);
    }

    public String deleteDepartment(Long id) {
        String message="";
        try {
            departmentRepository.deleteById(id);
            message="department deleted successfully";
        }catch(Exception e){
            message=e.getMessage();
        }
        return message;
    }


    public List<Department> fetchDepartment() {
        return  departmentRepository.findAll();
    }

    public Department findById(long id) {
        Department department= new Department();
        try{
            department= departmentRepository.findById(id).get();
        }catch (Exception e){
            e.printStackTrace();
        }
        return department;
    }
}
