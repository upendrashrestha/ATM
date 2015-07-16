package visitor;


public interface MoneyElement {
	public double getValue();
	public void accept(IVisitor visitor, Integer number);
}

