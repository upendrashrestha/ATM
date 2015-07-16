package visitor;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class MoneyParser {

	
	//private Map<MoneyElement, Integer> moneyMap = new HashMap<MoneyElement, Integer>();
	

	public double calculateMoney(Map<MoneyElement, Integer> moneyMap) {
		
		MoneyVisitor moneyVisitor = new MoneyVisitor();
		List<MoneyElement> moneyList = new ArrayList<MoneyElement>(moneyMap.keySet());
		
		for (MoneyElement money : moneyList) {
			
			money.accept(moneyVisitor, moneyMap.get(money));
		}
	
		return moneyVisitor.getTotalValue();
	}
	
/*		public Map<MoneyElement, Integer> getMoneyMap() {
	return moneyMap;
	}

	public void setMoneyMap(Map<MoneyElement, Integer> moneyMap) {
		this.moneyMap = moneyMap;
	}*/
	
}