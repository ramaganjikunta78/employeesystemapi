package com.example.employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="employee")
public class EmployeeEntity {
	@Id
	private long id;
	private String firstname;
	
	private String lastname;
	
	private String emailid;

}
