package com.venpozhil.employee.service;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.venpozhil.employee.dto.EmployeeDTO;
import com.venpozhil.employee.repository.EmployeeDAO;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class EmployeeServiceTest {

	    
	@Autowired
	private EmployeeDAO employeeDAO;
	
	
	@Test
	public void saveEmployee_NotExist() {
		employeeDAO.save(new EmployeeDTO(5,"jusint",new Date("20/10/2020"),"8888888","juint@test.com"));
	}

	@Test
	public void saveEmployee_Exist() {
		employeeDAO.save(new EmployeeDTO(5,"jusint",new Date("20/10/2020"),"8888888","juint@test.com"));
	}
}
