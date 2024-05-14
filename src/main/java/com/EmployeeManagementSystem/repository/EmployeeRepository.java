package com.EmployeeManagementSystem.repository;

import com.EmployeeManagementSystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query(value = "select id,name from Employee", nativeQuery = true)
    List<Employee> listEmployeeByLookup();

    @Query(value = "select * from Employee limit :limit offset :offset", nativeQuery = true)
    List<Employee> limitEmployee(Integer limit, Integer offset);
}
