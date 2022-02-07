package com.muthiora.employeeManager.repo;

import com.muthiora.employeeManager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> { //JpaRepository already has boilerplate modifier methods.
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id); //Optional is used in place of 'Employee' as the return type because sometimes the employee id might be missing.
}
