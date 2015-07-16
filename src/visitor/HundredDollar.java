package visitor;

import java.util.Map;

import chainOfResponsibility.AMoneyCounter;

public class HundredDollar extends AMoneyCounter implements MoneyElement {

	public void accept(IVisitor visitor, Integer number) {
		visitor.visit(this, number);
	}

	public double getValue() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public void count(Map<MoneyElement, Integer> map, double amount) {
		int numOfHundred = (int) (amount / 100);
		int remainder = (int) (amount % 100);
		if (numOfHundred > 0) {
			map.put(new HundredDollar(), numOfHundred);
			amount = amount - numOfHundred * 100;
		}
		if (this.nextCounter != null) {
			this.nextCounter.count(map, amount);
		}

	}

}
