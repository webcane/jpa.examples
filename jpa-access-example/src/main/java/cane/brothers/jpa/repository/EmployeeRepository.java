package cane.brothers.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import cane.brothers.jpa.domain.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {	
}
