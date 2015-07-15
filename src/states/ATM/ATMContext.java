package states.ATM;

public class ATMContext {

	private static ATMContext atmContext = new ATMContext();
	private IState noCard;
	private IState hasCard;
	private IState loggedIn;
	private IState hasMoney;
	private IState noMoney;
	private IState damage;
	
	private IState currentState;

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

	
	public void checkBalance() {
		// TODO Auto-generated method stub
		
	}

	
	public void drawAmount() {
		// TODO Auto-generated method stub
		
	}

	
	public void depositAmount() {
		// TODO Auto-generated method stub
		
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

	public IState getCurrentState() {
		return currentState;
	}

	public void setCurrentState(IState currentState) {
		this.currentState = currentState;
	}

	public IState getNoCard() {
		return noCard;
	}

	public void setNoCard(IState noCard) {
		this.noCard = noCard;
	}

	public IState getHasCard() {
		return hasCard;
	}

	public void setHasCard(IState hasCard) {
		this.hasCard = hasCard;
	}

	public IState getLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(IState loggedIn) {
		this.loggedIn = loggedIn;
	}

	public IState getHasMoney() {
		return hasMoney;
	}

	public void setHasMoney(IState hasMoney) {
		this.hasMoney = hasMoney;
	}

	public IState getNoMoney() {
		return noMoney;
	}

	public void setNoMoney(IState noMoney) {
		this.noMoney = noMoney;
	}

	public IState getDamage() {
		return damage;
	}

	public void setDamage(IState damage) {
		this.damage = damage;
	}
	
	
	
	
}
