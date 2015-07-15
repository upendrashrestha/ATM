package visitor;


public interface IVisitor {

	public void visit(OneDollar oneDollar);

	public void visit(FiveDollar fiveDollar);

	public void visit(TenDollar tenDollar);

	public void visit(TwentyDollar twentyDollar);

	public void visit(HundredDollar hundredDollar);

}
