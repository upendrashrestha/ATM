package states.ATM;

public class ATMContext {

	private static ATMContext atmContext = new ATMContext();
	private AState noCard;
	private AState hasCard;
	private AState loggedIn;
	private AState hasMoney;
	private AState noMoney;
	private AState damage;
	
	private AState currentState;

	private ATMContext() {
		
		noCard = new NoCard();
		hasCard = new HasCard();
		loggedIn = new LoggedIn();
		hasMoney = new HasMoney();
		noMoney = new NoMoney();
		damage = new Damage();
		
		this.currentState = noCard;
	}
	
	public static ATMContext getInstance(){
		return atmContext;
	}

	public void insertCard(String string) {
		this.currentState.insertCard(this, string);
	}

	
	public boolean insertPin(String pin) {
		
		// User insert pin and press Enter
		return this.currentState.insertPin(this, pin);
	}

	
	public double checkBalance() {
		 
		return this.currentState.checkBalance(this);
		
	}

	
	public void drawAmount(Double amount) {
		this.currentState.drawAmount(atmContext,amount);
	}

	
	public void depositAmount() {
		
		this.currentState.depositAmount(this);
	}

	
	public void changePin() {
		// TODO Auto-generated method stub
		
	}

	
	public void payUtility() {
		// TODO Auto-generated method stub
		
	}

	
	public void notifyDamage() {
		// TODO Auto-generated method stub
		
	}

	
	public void notifyOutOfMoney() {
		// TODO Auto-generated method stub
		
	}

	
	public void printReceipt() {
		// TODO Auto-generated method stub
		
	}

	
	public void sendSMS() {
		// TODO Auto-generated method stub
		
	}

	public AState getCurrentState() {
		return currentState;
	}

	public void setCurrentState(AState currentState) {
		this.currentState = currentState;
	}

	public AState getNoCard() {
		return noCard;
	}

	public void setNoCard(AState noCard) {
		this.noCard = noCard;
	}

	public AState getHasCard() {
		return hasCard;
	}

	public void setHasCard(AState hasCard) {
		this.hasCard = hasCard;
	}

	public AState getLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(AState loggedIn) {
		this.loggedIn = loggedIn;
	}

	public AState getHasMoney() {
		return hasMoney;
	}

	public void setHasMoney(AState hasMoney) {
		this.hasMoney = hasMoney;
	}

	public AState getNoMoney() {
		return noMoney;
	}

	public void setNoMoney(AState noMoney) {
		this.noMoney = noMoney;
	}

	public AState getDamage() {
		return damage;
	}

	public void setDamage(AState damage) {
		this.damage = damage;
	}

	public void ejectCard() {
		this.currentState.ejectCard(this);
		
	}
	
	
	
	
}
