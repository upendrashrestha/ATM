package command;

import proxy.atm.IBank;

public class AuthenticatePin implements ICommand {
	
	private String pin;
	private IBank bankProxy;
	

	public AuthenticatePin(String pin, IBank bankProxy) {
		
		this.pin = pin;
		this.bankProxy = bankProxy;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub

	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub

	}

}
