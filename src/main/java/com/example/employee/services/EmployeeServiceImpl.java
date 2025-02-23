package com.example.employee.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.entity.EmployeeEntity;
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
		
		
		EmployeeEntity employeeentity =new EmployeeEntity();
		
		BeanUtils.copyProperties(employee,employeeentity);
		
		employeerepository.save(employeeentity);
		// TODO Auto-generated method stub
		return employee;
	}

}
