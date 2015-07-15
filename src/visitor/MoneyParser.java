package visitor;

import java.util.List;
import java.util.ArrayList;

public class MoneyParser {

	
	private List<MoneyElement> listMoneyElement;// = new
												// ArrayList<MoneyElement>();

	public double calculateMoney() {
		MoneyVisitor money = new MoneyVisitor();
		for (MoneyElement m : listMoneyElement) {
			m.accept(money);
		}
		return money.getTotalValue();
	}
}