package com.example.employee.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.entity.Employee;
import com.example.employee.model.EmployeeModel;
import com.example.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	public EmployeeServiceImpl(EmployeeRepository employeerepository) {
		super();
		this.employeerepository = employeerepository;
	}

	@Autowired
	private EmployeeRepository employeerepository;

	@Override
	public EmployeeModel createEmployee(EmployeeModel employee) {
		
		
		Employee employeeentity =new Employee();
		
		BeanUtils.copyProperties(employee,employeeentity);
		
		employeerepository.save(employeeentity);
		// TODO Auto-generated method stub
		return employee;
	}

	@Override
	public List<Employee> getallEmployees() {
		// TODO Auto-generated method stub
		
		List<Employee>employee = employeerepository.findAll();
		
		return employee;
	}

}
