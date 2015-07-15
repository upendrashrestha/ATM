package visitor;


public class MoneyVisitor implements IVisitor {

	public MoneyVisitor()
	{
		
	}
	
	double totalMoney;
	
	public void visit(OneDollar oneDollar) {
		totalMoney+=oneDollar.getValue();
	}

	public void visit(FiveDollar fiveDollar) {
		totalMoney+=fiveDollar.getValue();		
	}

	public void visit(TenDollar tenDollar) {
		totalMoney+=tenDollar.getValue();		
	}

	public void visit(TwentyDollar twentyDollar) {
		totalMoney+=twentyDollar.getValue();		
	}

	public void visit(HundredDollar hundredDollar) {
		totalMoney+=hundredDollar.getValue();		
	}
	
	public double getTotalValue()
	{
		return this.totalMoney;
	}

}
