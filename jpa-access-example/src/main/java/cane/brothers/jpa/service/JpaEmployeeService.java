package cane.brothers.jpa.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

import cane.brothers.jpa.domain.Employee;
import cane.brothers.jpa.repository.EmployeeRepository;

public class JpaEmployeeService implements EmployeeService {

	// @Resource
	@Autowired
	private EmployeeRepository repo;
	
	public Employee getEmployee(long id) {
		return repo.findOne(id);
	}

	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

	@Override
	public Employee addEmployee(Employee e) {
		return repo.save(e);
	}

}
