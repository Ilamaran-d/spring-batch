package com.venpozhil.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.venpozhil.employee.dto.DepartmentDTO;
import com.venpozhil.employee.dto.EmployeeDTO;
import com.venpozhil.employee.dto.SalaryDTO;
import com.venpozhil.employee.repository.EmployeeDAO;


@Service
public class EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	//@Autowired
	//private RestTemplate restTemplate;
	
	@Autowired
	private WebClient.Builder webClientBuilder; 
	
	public List<EmployeeDTO> getEmployees(){
		return employeeDAO.findAll();
	}
	
	public EmployeeDTO getEmployee(int empId) {
		//SalaryDTO salary = restTemplate.getForObject("http://localhost:8082/salary/getSalary/"+empId, SalaryDTO.class);
		SalaryDTO salary =  webClientBuilder.build()
		.get()
		.uri("http://salary-service/salary/getSalary/"+empId)
		.retrieve()
		.bodyToMono(SalaryDTO.class)
		.block();
		
		System.out.println(salary.getSalary());
		
		DepartmentDTO department =  webClientBuilder.build()
				.get()
				.uri("http://department-service/department/getDepartment/"+empId)
				.retrieve()
				.bodyToMono(DepartmentDTO.class)
				.block();
				//.timeout(Duration.ofMillis(3000));;
		
		System.out.println(department.getSection());
		
		EmployeeDTO emp = employeeDAO.findById(empId).get();
		//emp.setSalary(salary);
		return emp;
	}
	
	public EmployeeDTO saveEmployee(EmployeeDTO empDTO){
		return employeeDAO.save(empDTO);
	}
	
	public int updateEmployee(EmployeeDTO empDTO){
		return employeeDAO.updateEmployee(empDTO.getEmpName(), empDTO.getEmpId());
	}
	
	public int deleteEmployee(int empId){
		return employeeDAO.deleteEmployee(empId);
	}
	
}
