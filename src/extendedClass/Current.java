package extendedClass;

import interfaceClass.Account;

public class Current extends Account{

	public Current(String name, double balance) {
		super(name, balance);
		this.setCurrent(true);		
	}

	

}
