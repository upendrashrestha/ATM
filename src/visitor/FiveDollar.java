package visitor;


public class FiveDollar implements MoneyElement {

	
	
	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);		
	}

	@Override
	public double getValue() {
		// TODO Auto-generated method stub
		return 5;
	}

}
