package visitor;

import java.util.Map;

import chainOfResponsibility.AMoneyCounter;


public class FiftyDollar extends AMoneyCounter implements MoneyElement {

	public void accept(IVisitor visitor, Integer number) {
		visitor.visit(this, number);
	}

	public double getValue() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public void count(Map<MoneyElement, Integer> map, double amount) {
		int numOfFifty = (int) (amount / 50);
		int remainder = (int) (amount % 50);
		if (numOfFifty > 0) {
			map.put(new FiftyDollar(), numOfFifty);
			amount = amount - numOfFifty * 50;
		}
		if (this.nextCounter != null) {
			this.nextCounter.count(map, amount);
		}		
	}

}
