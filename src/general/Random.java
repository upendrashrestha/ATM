package general;

import java.util.HashMap;
import java.util.Map;

import visitor.FiftyDollar;
import visitor.FiveDollar;
import visitor.HundredDollar;
import visitor.MoneyElement;
import visitor.OneDollar;
import visitor.TenDollar;
import visitor.TwentyDollar;


public class Random {

	public static Map<MoneyElement, Integer> generateMoneyMap() {

		int number;
		int keyRandom, counter = 0;

		Map<MoneyElement,Integer> moneyMap= new HashMap<MoneyElement, Integer>();
		Map<Integer,MoneyElement> map= new HashMap<Integer, MoneyElement>();
		map.put(1, new OneDollar());
		map.put(2, new FiveDollar());
		map.put(3, new TenDollar());
		map.put(4, new TwentyDollar());
		map.put(5, new FiftyDollar());
		map.put(6, new HundredDollar());

		for (int i = 1; counter < 21 ; i++) {

			number = (int )(Math.random() * 20 + 1);
			keyRandom =(int )(Math.random() * 6 + 1);
			counter += number;

			moneyMap.put(map.get(keyRandom), number);
		}

		return moneyMap;
	}

}
