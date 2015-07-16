package proxy.atm;

import facade.BankFacade;
import interfaceClass.Account;

public class BankProxy extends ABank {

	BankFacade realBankSubject;

	public BankProxy()
	{
		this.realBankSubject=new BankFacade();
	}
	@Override
	public void checkBalance() {
		if(this.realBankSubject==null)
		{
			this.realBankSubject=new BankFacade();
		}
		this.realBankSubject.checkBalance();
		this.balance = realBankSubject.balance;
	}

	@Override
	public void drawAmount(Account account,double amount) {
		if(this.realBankSubject==null)
		{
			this.realBankSubject=new BankFacade();
		}
		this.realBankSubject.drawAmount(account,amount);

	}

	@Override
	public void depositAmount(Account account, double amount) {
		if(this.realBankSubject==null)
		{
			this.realBankSubject=new BankFacade();
		}
		this.realBankSubject.depositAmount(account, amount);

	}

	@Override
	public void changePin(Account account, String pin) {
		if(this.realBankSubject==null)
		{
			this.realBankSubject=new BankFacade();
		}
		this.realBankSubject.changePin(account, pin);

	}
	@Override
	public void authenticatePin(String pin) {
		if(this.realBankSubject==null)
		{
			this.realBankSubject=new BankFacade();
		}
	 this.realBankSubject.authenticatePin(pin);
	 
	 if(realBankSubject.isSuccess()){
		 
		 setSuccess(true);
	 }
	 else{
		 
		 setSuccess(false);
	 }
	}

}
