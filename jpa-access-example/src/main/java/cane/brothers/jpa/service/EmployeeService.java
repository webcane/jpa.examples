package cane.brothers.jpa.service;

import java.util.List;

import cane.brothers.jpa.domain.Employee;

public interface EmployeeService {

	Employee addEmployee(Employee e);
	
	Employee getEmployee(long id);
	
	List<Employee> getAllEmployees();
}
