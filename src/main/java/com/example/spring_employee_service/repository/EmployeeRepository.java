package com.example.spring_employee_service.repository;

import com.example.spring_employee_service.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    private final List<Employee> employees = new ArrayList<>();

    public Employee addEmployee(Employee employee) {
        employees.add(employee);
        return employee;
    }

    public Employee findById (Long id){
        return  employees.stream().filter(employee -> employee.id().equals(id))
                .findFirst()
                .orElseThrow();
    }
    public List<Employee> findByDepartment (Long departmentId){
        return  employees.stream()
                .filter(employee -> employee.departmentId().equals(departmentId))
                .toList();
    }

    public List<Employee> findAll(){
        return employees;
    }
}
