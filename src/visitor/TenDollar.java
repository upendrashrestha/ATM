package visitor;

import java.util.Map;

import chainOfResponsibility.AMoneyCounter;


public class TenDollar extends AMoneyCounter implements MoneyElement {

	
	public void accept(IVisitor visitor, Integer number) {
		visitor.visit(this, number);		
	}

	public double getValue() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public void count(Map<MoneyElement, Integer> map, double amount) {
		int numOfTen = (int) (amount / 10);
		int remainder = (int) (amount % 10);
		if (numOfTen > 0) {
			map.put(new TenDollar(), numOfTen);
			amount = amount - numOfTen * 10;
		}
		if (this.nextCounter != null) {
			this.nextCounter.count(map, amount);
		}		
	}

}
