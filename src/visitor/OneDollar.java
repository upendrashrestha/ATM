package visitor;

import java.util.Map;

import chainOfResponsibility.AMoneyCounter;


public class OneDollar extends AMoneyCounter implements MoneyElement {

	public void accept(IVisitor visitor, Integer number) {
		visitor.visit(this, number);
		
	}

	public double getValue() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public void count(Map<MoneyElement, Integer> map, double amount) {
		int numOfOne = (int) (amount / 1);
		int remainder = (int) (amount % 1);
		if (numOfOne > 0) {
			map.put(new OneDollar(), numOfOne);
			amount = amount - numOfOne * 1;
		}
		if (this.nextCounter != null) {
			this.nextCounter.count(map, amount);
		}	
	}

	

}
