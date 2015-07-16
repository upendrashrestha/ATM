package command;

import proxy.atm.ABank;

public class CheckBalance implements ICommand {

	private ABank bankProxy;
	
	public CheckBalance(ABank bankProxy) {
		this.bankProxy = bankProxy;
	}

	public void execute() {
		 bankProxy.checkBalance();
	}

	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
