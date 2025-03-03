package com.example.employee.services;

import java.util.List;

import com.example.employee.entity.Employee;
import com.example.employee.model.EmployeeModel;

public interface EmployeeService {

	EmployeeModel createEmployee(EmployeeModel employee);

	List<Employee> getallEmployees();

	

}
