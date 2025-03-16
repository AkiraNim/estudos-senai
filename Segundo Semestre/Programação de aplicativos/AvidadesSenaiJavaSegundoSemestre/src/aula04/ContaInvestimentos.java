package aula04;

public class ContaInvestimentos {
	
	@SuppressWarnings("unused")
	private String cardholderName, accountNumber, password;
	
	@SuppressWarnings("unused")
	private double balance, interestRate;
	
	public ContaInvestimentos(String cardholderName, String password, String accountNumber ) {
		this.accountNumber = accountNumber;
		this.balance = 0;
		this.cardholderName = cardholderName;
		this.password = password;
	}
	public String getPassword() {
		return password;
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
	public double getInterestRate() {
		return this.interestRate;
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
	public boolean addInterest() {
		if(balance>0.1) {
			interestRate=0.1*balance;
			balance-=interestRate;
			return true;
			}
			else {
				return false;
			}
		}
		
		
	}


