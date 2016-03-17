package cane.brothers.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cane.brothers.jpa.config.AppConfig;
import cane.brothers.jpa.domain.Employee;
import cane.brothers.jpa.service.EmployeeService;


public class App {

	private static final Logger log = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) {
		
		try (ConfigurableApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class)) {
			
			EmployeeService eService = context.getBean(EmployeeService.class);
			
			eService.addEmployee(new Employee("123"));
			eService.addEmployee(new Employee("321"));
			
			for(Employee e : eService.getAllEmployees()) {
				log.info(e.getNumber());
			}
		}

	}

}
