package com.venpozhil.employee.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table(name = "SALARY_SERVICE")
public class SalaryDTO {

	
	@Id
	@Column(name = "EMP_ID")
	private int empId;
	
	@Column(name = "SALARY")
	private double salary;
	
	@OneToMany(targetEntity = EmployeeDTO.class)
	private List<EmployeeDTO> user = new ArrayList<>();
	
	public SalaryDTO() {
		super();
	}

	public SalaryDTO(int empId, double salary) {
		super();
		this.empId = empId;
		this.salary = salary;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
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
		SalaryDTO other = (SalaryDTO) obj;
		if (empId != other.empId)
			return false;
		return true;
	}
	
	
	
}
