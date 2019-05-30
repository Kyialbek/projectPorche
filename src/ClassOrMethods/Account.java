package ClassOrMethods;

public class Account {
	int deposit;
	int balance;
	String clientName;
	String accountNumber ="12343455";
	int addedValue;
	
	
	public int addDepost(int addAmount) {
		balance = balance+addAmount;
		
		System.out.println("Current balance is " + balance);
		return balance;
		
	}
public int withdrawDeposit(int anotherDeposit) {
	balance = balance-anotherDeposit;
	System.out.println("Your current balance is "+balance);
	return balance;
	
}
public void changeAccountNumber(String accountNumber) {
	accountNumber = "1234567";
	
	
}
public static void main(String[] args) {
	
	Account account = new Account();
	account.changeAccountNumber("5444343434");
	
}
}
