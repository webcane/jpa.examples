package cane.brothers.jpa.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
//import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Data
@Builder
@Entity
public class Todo {
	
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @Getter
  @Setter
  private String summary;
  
  @Getter
  @Setter
  private String description;

} 

