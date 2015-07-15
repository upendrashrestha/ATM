package states.ATM;

import gui.Main;

public class ATMMachine {

	public static void main(String[] args) {
		
		Data data = new Data();
		data.setCustomer();
		
		Main main = new Main();
		main.NewScreen();
	}
}
