package com.venpozhil.employee.dto;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_SERVICE")
public class EmployeeDTO {
	
	public EmployeeDTO(int empId, String empName, Date dob, String phone, String email) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dob = dob;
		this.phone = phone;
		this.email = email;
	}
	
	public EmployeeDTO() {
		super();
	}

	
	@Id
	@Column(name = "EMP_ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int empId;
	
	@Column(name = "EMP_NAME", nullable = false)
	public String empName;
	
	@Column(name = "EMP_DOB", nullable = false)
	public Date dob;
	
	@Column(name = "EMP_PHOEN", nullable = false)
	public String phone;
	
	@Column(name = "EMP_EMAIL", nullable = false)
	public String email;
	
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "EMP_ID")
    private SalaryDTO salary;
	
	
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public SalaryDTO getSalary() {
		return salary;
	}
	  
	public void setSalary(SalaryDTO salary) {
		this.salary = salary;
	}
	 

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeDTO other = (EmployeeDTO) obj;
		if (empId != other.empId)
			return false;
		return true;
	}
	
	
	
	
}
