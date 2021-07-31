package com.venpozhil.employee.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DEPARTMENT_SERVICE")
public class DepartmentDTO {

	@Id
	@Column(name = "EMP_ID", nullable = false)
	private int empId;
	
	@Column(name = "DEPT" , nullable = false, length = 255)
	private String department;
	
	@Column(name = "GRP" , nullable = false, length = 255)
	private String group;
	
	@Column(name = "SECT", nullable = false, length = 255)
	private String section;
	
	public DepartmentDTO() {
		super();
	}
	
	public DepartmentDTO(int empId, String department, String group, String section) {
		super();
		this.empId = empId;
		this.department = department;
		this.group = group;
		this.section = section;
	}


	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	
	
	
}
