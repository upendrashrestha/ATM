package visitor;


public class OneDollar implements MoneyElement {

	public void accept(IVisitor visitor) {
		visitor.visit(this);
		
	}

	@Override
	public double getValue() {
		// TODO Auto-generated method stub
		return 1;
	}

	

}
