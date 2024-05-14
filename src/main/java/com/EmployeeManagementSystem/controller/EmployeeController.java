package com.EmployeeManagementSystem.controller;

import com.EmployeeManagementSystem.entity.Department;
import com.EmployeeManagementSystem.entity.Employee;
import com.EmployeeManagementSystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.management.AttributeNotFoundException;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/save")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        Employee createdEmployee = employeeService.createEmployee(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdEmployee);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) throws AttributeNotFoundException{
        return employeeService.deleteEmployee(id);
    }



    @PostMapping("/list")
    public List<Employee> list(){
        return employeeService.fetchEmployee();
    }

    @GetMapping("/view/{id}")
    public Employee getEmployee(@PathVariable long id)throws AttributeNotFoundException{
        return employeeService.findById(id);

    }
    @GetMapping("/list-employee")
    public List<Employee> listEmployee(@RequestParam("lookup") boolean lookup) throws AttributeNotFoundException{
        return employeeService.listEmployee(lookup);
    }

    @GetMapping("/pagination")
    public List<Employee> limitEmployee(@RequestParam("limit") Integer limit, @RequestParam("offset") Integer offset) throws AttributeNotFoundException{
        return employeeService.limitEmployee(limit, offset);
    }

}
