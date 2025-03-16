package aula02;

public class CurrentAccount {

	@SuppressWarnings("unused")
	private String cardholderName, accountNumber;
	@SuppressWarnings("unused")
	private double balance;
	
	public CurrentAccount(String accountNumber, String cardholderName) {
		this.accountNumber = accountNumber;
		this.balance = 0;
		this.cardholderName = cardholderName;
	}
	public String getAccountNumber() {
		return this.accountNumber;
	}
	public String getCardHolderName() {
		return this.cardholderName;
	}
	public double getBalance() {
		return this.balance;
	}
	
	public void deposit(double value) {
		if(value>0) {
			this.balance = this.balance + value;
		}
	}
	public boolean withdraw(double value) {
		if(value>0) {
			if(value<=balance) {
				balance-=value;
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
}
