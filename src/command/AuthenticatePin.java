package command;

import proxy.atm.ABank;

public class AuthenticatePin implements ICommand {

	private String pin;
	private ABank bankProxy;

	public AuthenticatePin(String pin, ABank bankProxy) {

		this.pin = pin;
		this.bankProxy = bankProxy;
	}

	public void execute() {

		bankProxy.authenticatePin(pin);
	}

	public void undo() {
		// TODO Auto-generated method stub

	}

}
