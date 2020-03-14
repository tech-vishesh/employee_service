package com.example.orginzation.employee.mapper;

import com.example.orginzation.employee.entity.EmployeeEntity;
import com.example.orginzation.employee.model.Address;
import com.example.orginzation.employee.model.Department;
import com.example.orginzation.employee.model.EmployeeModel;

public class EmployeeMapper {

	public static EmployeeModel entityToModel(EmployeeEntity employeeEntity) {
		EmployeeModel employeeModel = new EmployeeModel();
		Address address = new Address();
		Department department = new Department();
		employeeModel.setEmployeeId(employeeEntity.getEmpId());
		employeeModel.setEmployeeName(employeeEntity.getEmpName());
		address.setAddressType(employeeEntity.getAddType());
		address.setLocality(employeeEntity.getEmpLocality());
		address.setPinCode(employeeEntity.getPinCode());
		employeeModel.setAddress(address);
		employeeModel.setDepartment(department);
		return employeeModel;
	}
}
