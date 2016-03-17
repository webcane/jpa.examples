package cane.brothers.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
// @Access(AccessType.FIELD)
public class Employee {
	@Id
	@GeneratedValue
	private long id;

	private String number;

	// @Access(AccessType.PROPERTY)
	public String getNumber() {
		return "1234556";
	}

	public Employee() {
	}

	public Employee(String number) {
		this.number = number;
	}
	
}
