package visitor;


public class HundredDollar implements MoneyElement {

	

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);		
	}

	@Override
	public double getValue() {
		// TODO Auto-generated method stub
		return 100;
	}

}
