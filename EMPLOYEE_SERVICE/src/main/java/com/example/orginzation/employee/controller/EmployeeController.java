package com.example.orginzation.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.orginzation.employee.model.EmployeeModel;
import com.example.orginzation.employee.service.EmployeeService;

@RestController
public class EmployeeController {

	@SuppressWarnings("rawtypes")
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employee/{id}")
	public EmployeeModel one(@PathVariable int id) {

		return employeeService.getEmployee(id);
	}
}
