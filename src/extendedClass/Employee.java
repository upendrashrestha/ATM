package extendedClass;

import interfaceClass.Account;
import interfaceClass.Person;

public class Employee extends Person {
	
	private String designation;

	protected Employee(String name, String address, String designation) {
		super(name, address);	
		this.designation=designation;
	}

}
