package com.venpozhil.employee.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.venpozhil.employee.dto.EmployeeDTO;

@Repository
@Transactional
public interface EmployeeDAO extends JpaRepository<EmployeeDTO, Integer> {
	
//	SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
//	List<EmployeeDTO> list = new ArrayList<EmployeeDTO>();
//	
//	public List<EmployeeDTO> getEmployees() {
//		
//		List<EmployeeDTO> list = new ArrayList<EmployeeDTO>();
//		try {
//			list.add(new EmployeeDTO(101, "Ilamaran", format.parse("24-05-1984"),"90232493", "ila@gmail.com"));
//			list.add(new EmployeeDTO(102, "Nila", format.parse("15-07-1988"),"90232493", "nila@gmail.com"));
//			list.add(new EmployeeDTO(103, "Pozhil", format.parse("12-06-2017"),"90232493", "pozhil@gmail.com"));
//			list.add(new EmployeeDTO(104, "Venbu", format.parse("15-11-2019"),"90232493", "venbu@gmail.com"));
//			return list;
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
//	
//	public EmployeeDTO getEmployee(int empId) {
//		try {
//			return new EmployeeDTO(101, "Venbu", format.parse("24-05-1984"), "90232493", "venbu@gmail.com");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
//
//	public String saveEmployee(EmployeeDTO empDTO) {
//		return "Successfully saved Employee";
//	}
//	
//	public String updateEmployee(EmployeeDTO empDTO) {
//		return "Successfully saved Employee";
//	}
//
//	public List<EmployeeDTO> deleteEmployee(int empId) {
//		return list;
//	}

	@Modifying(flushAutomatically = true)
	@Query("update EmployeeDTO c set c.empName = ?1 where empId=?2")
	int updateEmployee(@Param("empName") String empName , @Param("empId") int empId);
	
	@Modifying(flushAutomatically = true)
	@Query("delete from EmployeeDTO c where c.empId = ?1")
	int deleteEmployee(int empId);
	
	
}
