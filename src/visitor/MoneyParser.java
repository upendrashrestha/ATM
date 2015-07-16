package visitor;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class MoneyParser {

	
	public double calculateMoney(Map<MoneyElement, Integer> moneyMap) {
		
		MoneyVisitor moneyVisitor = new MoneyVisitor();
		List<MoneyElement> moneyList = new ArrayList<MoneyElement>(moneyMap.keySet());
		
		for (MoneyElement money : moneyList) {
			
			money.accept(moneyVisitor, moneyMap.get(money));
		}
	
		return moneyVisitor.getTotalValue();
	}
	
}