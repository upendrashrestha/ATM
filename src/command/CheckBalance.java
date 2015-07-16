package command;

import proxy.atm.ABank;

public class CheckBalance implements ICommand {

	private ABank bankProxy;
	
	public CheckBalance(ABank bankProxy) {
		this.bankProxy = bankProxy;
	}

	@Override
	public void execute() {
		 bankProxy.checkBalance();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
