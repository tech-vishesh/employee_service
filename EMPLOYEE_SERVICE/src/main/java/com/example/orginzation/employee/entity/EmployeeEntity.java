package com.example.orginzation.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class EmployeeEntity {

	@Id
	@Column(name="EMP_ID")
	private int empId;
	@Column(name="EMP_NAME")
	private String empName;
	@Column(name="EMP_ADD_TYPE")
	private String addType;
	@Column(name="EMP_LOCALITY")
	private String empLocality;
	@Column(name="PIN_CODE")
	private int pinCode;
	@Column(name="EMP_DEPARTMENT_ID")
	private int departmentId;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getAddType() {
		return addType;
	}
	public void setAddType(String addType) {
		this.addType = addType;
	}
	public String getEmpLocality() {
		return empLocality;
	}
	public void setEmpLocality(String empLocality) {
		this.empLocality = empLocality;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
}
