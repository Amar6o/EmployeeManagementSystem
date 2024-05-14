package com.EmployeeManagementSystem.repository;

import com.EmployeeManagementSystem.entity.DepartmentEmployeeMapping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentEmployeeMappingRepository extends JpaRepository<DepartmentEmployeeMapping, Long> {
}
