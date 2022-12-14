package com.linadev14.employee.service;
import com.linadev14.employee.model.Employee;

import java.util.List;

public interface EmployeeServiceInterface {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();

    boolean deleteEmployee(Long id);

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employee);

}
