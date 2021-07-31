package com.venpozhil.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.venpozhil.employee.dto.A;
import com.venpozhil.employee.dto.EmployeeDTO;
import com.venpozhil.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	@GetMapping(path = "/getEmployees", produces = "application/json")
	public A getEmployees(){
		
		A a = new A("Ila", "Nila");
		
		return a;
		
		//return empService.getEmployees();
		
	}

	@GetMapping(path = "/getEmployee/{empId}", produces = "application/json")
	public EmployeeDTO getEmployee(@PathVariable("empId") int empId){
		return empService.getEmployee(empId);
		
	}
	
	@PostMapping(path = "/saveEmployee", produces = "application/json")
	public EmployeeDTO saveEmployee(@RequestBody EmployeeDTO empDTO){
		return empService.saveEmployee(empDTO);
		
	}
	
	@PutMapping(path = "/updateEmployee", produces = "application/json")
	public int updateEmployee(@RequestBody EmployeeDTO empDTO){
		return empService.updateEmployee(empDTO);
		
	}
	
	@DeleteMapping(path = "/deleteEmployee/{empId}", produces = "application/json")
	public int deleteEmployee(@PathVariable("empId") int empId){
		return empService.deleteEmployee(empId);
		
	}
}
