package com.venpozhil.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venpozhil.employee.dto.EmployeeDTO;

public interface EmployeeDAOImpl extends JpaRepository<EmployeeDTO, Integer>{

	

}
