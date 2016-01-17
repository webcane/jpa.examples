package cane.brothers.jpa.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.eclipse.xtend.lib.annotations.Data;

@Data
@Entity
public class Todo {
	
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  String summary;
  String description;

} 

