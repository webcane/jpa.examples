package cane.brothers.jpa.example.utils;

import lombok.experimental.UtilityClass;
import cane.brothers.jpa.example.model.Todo;

@UtilityClass
public class TodoUtils {

	private int i = 1;
	
	public static Todo getTodo() {
		return new Todo();
	}

}
