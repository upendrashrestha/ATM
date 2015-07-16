package visitor;


public class MoneyVisitor implements IVisitor {

	public MoneyVisitor()
	{
		
	}
	
	double totalMoney;
	
	public void visit(OneDollar oneDollar, Integer number) {
		totalMoney+=oneDollar.getValue() * number;
	}

	public void visit(FiftyDollar fiftyDollar, Integer number) {
		totalMoney+=fiftyDollar.getValue() * number;		
	}

	
	public void visit(FiveDollar fiveDollar, Integer number) {
		totalMoney+=fiveDollar.getValue()* number;		
	}

	public void visit(TenDollar tenDollar, Integer number) {
		totalMoney+=tenDollar.getValue()*number;		
	}

	public void visit(TwentyDollar twentyDollar, Integer number) {
		totalMoney+=twentyDollar.getValue()*number;		
	}

	public void visit(HundredDollar hundredDollar, Integer number) {
		totalMoney+=hundredDollar.getValue()* number;		
	}
	
	public double getTotalValue()
	{
		return this.totalMoney;
	}


}
