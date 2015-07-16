package visitor;


public interface IVisitor {

	public void visit(OneDollar oneDollar, Integer number);

	public void visit(FiveDollar fiveDollar, Integer number);

	public void visit(TenDollar tenDollar, Integer number);

	public void visit(TwentyDollar twentyDollar, Integer number);
	
	public void visit(FiftyDollar fiftyDollar, Integer number);

	public void visit(HundredDollar hundredDollar, Integer number);

}
