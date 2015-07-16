package command;

import proxy.atm.ABank;

public class DrawAmount implements ICommand {

	private ABank bankProxy;
	private Double amount;
	
	public DrawAmount(ABank bankProxy, Double amount) {
		
		this.bankProxy = bankProxy;
		this.amount = amount;
	}

	public void execute() {
		
		bankProxy.drawAmount(amount);
		
	}

	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
