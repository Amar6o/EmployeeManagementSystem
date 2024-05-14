package com.EmployeeManagementSystem.service;

import com.EmployeeManagementSystem.entity.Employee;
import com.EmployeeManagementSystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public String deleteEmployee(Long id){
        String message="";
        try {
            employeeRepository.deleteById(id);
            message="employee deleted successfully";
        }catch (Exception e){
            message = e.getMessage();
        }
        return message;
    }

    public List<Employee> fetchEmployee(){
        return employeeRepository.findAll();
    }

    public Employee findById(long id) {
        Employee employee=new Employee();
        try{
            employee=employeeRepository.findById(id).get();
        }catch (Exception e){
            e.printStackTrace();
        }
        return employee;
    }

    public List<Employee> listEmployee(boolean lookup) {
        List<Employee> li=new ArrayList<>();
        try{
            if(lookup){
                li=employeeRepository.listEmployeeByLookup();
            }else{
                li=employeeRepository.findAll();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return li;
    }

    public List<Employee> limitEmployee(Integer limit, Integer offset) {
        List<Employee> l=new ArrayList<>();
        try{
            l=employeeRepository.limitEmployee(limit,offset);
        }catch (Exception e){
            e.printStackTrace();
        }
        return l;
    }
}
