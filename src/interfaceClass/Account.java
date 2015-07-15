package interfaceClass;

public abstract class Account {

	private String name;
	private double balance;
	private boolean hasBalance;
	private boolean isCurrent;
	private String pin;
	
	protected Account(String name, double balance)
	{
		this.name=name;
		this.balance=balance;
		if(this.balance>0)
		{
			this.hasBalance=true;
		}
		this.isCurrent=false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isHasBalance() {
		return hasBalance;
	}

	public void setHasBalance(boolean hasBalance) {
		this.hasBalance = hasBalance;
	}

	public boolean isCurrent() {
		return isCurrent;
	}

	public void setCurrent(boolean isCurrent) {
		this.isCurrent = isCurrent;
	}

	public void deductBalance(double amount) {
		this.balance=this.balance-amount;
		
	}

	public void addBalance(double amount) {
		this.balance=this.balance+amount;
	}

	public void changePin(String pin) {
		this.pin=pin;
	}
	
	
}
