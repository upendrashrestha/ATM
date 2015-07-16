package chainOfResponsibility;

import java.util.Map;

import visitor.MoneyElement;

public abstract class AMoneyCounter {
	protected AMoneyCounter nextCounter;

	public abstract void count(Map<MoneyElement, Integer> map, double amount);
}
