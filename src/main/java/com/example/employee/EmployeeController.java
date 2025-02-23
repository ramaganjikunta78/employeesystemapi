package com.example.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.model.EmployeeModel;
import com.example.employee.services.EmployeeService;

@RestController
@RequestMapping("/api/v1/")

public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeservice;
	
	public EmployeeController(EmployeeService EmployeeService) {
		
		this.employeeservice= employeeservice;
	}
	@PostMapping("employees")
	public EmployeeModel createEmployee(@RequestBody EmployeeModel employee) {
		 return ( employeeservice.createEmployee(employee));
		
	}

}
