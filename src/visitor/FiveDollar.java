package visitor;

import java.util.Map;

import chainOfResponsibility.AMoneyCounter;


public class FiveDollar extends AMoneyCounter implements MoneyElement {

	
	
	public void accept(IVisitor visitor, Integer number) {
		visitor.visit(this, number);		
	}

	public double getValue() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public void count(Map<MoneyElement, Integer> map, double amount) {
		int numOfFive = (int) (amount / 5);
		int remainder = (int) (amount % 5);
		if (numOfFive > 0) {
			map.put(new FiveDollar(), numOfFive);
			amount = amount - numOfFive * 5;
		}
		if (this.nextCounter != null) {
			this.nextCounter.count(map, amount);
		}	
	}

}
