package com.example.orginzation.employee.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.orginzation.employee.entity.EmployeeEntity;
import com.example.orginzation.employee.mapper.EmployeeMapper;
import com.example.orginzation.employee.model.EmployeeModel;
import com.example.orginzation.employee.repository.EmployeeRepository;

@Service
public class EmployeeService<employeeRepository> {

	@Autowired
	public EmployeeRepository employeeRepository;

	public EmployeeModel getEmployee(int id) {
		Optional<EmployeeEntity> employeeEntity = employeeRepository.findById(new Integer(id));
		if (employeeEntity.isPresent()) {
			return EmployeeMapper.entityToModel(employeeEntity.get());
		} else {
			return new EmployeeModel();
		}
	}

}
