package bankaccountapp;

public class Checking extends Account {
	// List properties specific to the Checking accounts
	private long debitCardNumber;
	private int debitCardPin;
	
	// Constructor to initialize checking account properties
	public Checking( String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() * .15;
	}
	
	// List any methods specific to the checking account 
	private void setDebitCard() {
		debitCardNumber = (long) (Math.random() * Math.pow(10, 12));
		debitCardPin = (int) (Math.random() * Math.pow(10, 4));
	}
	
	
	
	public void showInfo() {
		System.out.println("ACCOUNT TYPE: Checking");
		super.showInfo();
		System.out.println(
				"Your Checking Account Features" +
				"\n Debit Card NUmber: " + debitCardNumber +
				"\n Debit Card PIN: " + debitCardPin
				);
	}
}
