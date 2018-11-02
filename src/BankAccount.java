
public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BAccount acc1 = new BAccount("8369715514",1500);
		
		acc1.setName("Sajid");
		System.out.println("Account Holder Name: " + acc1.getName());
		
		acc1.withdrawal(500);
		acc1.deposit(25000);
	}

}

class BAccount {
	//Properties of Bank Account
	private static int id = 00;
	private String accountNumber; //id + random 2 digit number + first 2 digit of SSN
	private static final String routingNumber = "12111904";
	private String name;
	private String SSN;
	private double balance;
	
	//Constructor
	public BAccount(String SSN, double initialDeposit) {
		balance = initialDeposit;
		System.out.println("New Account Created");
		this.SSN = SSN;
		id++;
		setAccountNumber();
	}
	
	private void setAccountNumber() {
		int random = (int)(Math.random() * 100);
		accountNumber = id + "" + random + SSN.substring(0,2);
		System.out.println("Your Account Number: " + accountNumber);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void withdrawal(double amount) {
		balance = balance - amount;
		System.out.println("Your Account is Debited with: " + amount + "Rs");
		showBalance();
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Your Account is Credited with: " + amount + "Rs");
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Your Account Balance is: Rs" + balance + "Rs");
	}
	
}