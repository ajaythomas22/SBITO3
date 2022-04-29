
public class BankTest {
	
	public static void main(String[] args) {
		
		//BankAccount bankObj1 = new BankAccount();
		//bankObj1.setBankAccount(100, "Anand", 1000000);
		//bankObj1.setBankAccount(-200, "Sruthi", 1000000.5541);
		//bankObj1.setBankAccount(300, "Ajay", -500);
		//bankObj1.setBankAccount(400, null, -500);
		//bankObj1.printBankAccount();
		
		
		//BankAccount bankObj2 = new BankAccount(200, "Sruthi", 20000);
		//bankObj2.printBankAccount();
		
		//BankAccount bankObj3 = null;
		
		//bankObj3 = new BankAccount(300, "Ajay", 50000);
		//bankObj3.printBankAccount();
		
		//BankAccount bankObj2 = new BankAccount();
		//bankObj1.setBankAccount(200, "Sruthi", 2000000);
		//bankObj1.printBankAccount();
	 }
}

class BankAccount {
	
	//data members of a class
	private int accountNumber;
	private String accountHolderName;
	private double accountBalance;
	private String mobileNumber;
	
	//member functions or methods
	void setBankAccount( int x, String y, double z) {
		
		if (x < 0)
		{
			throw new RuntimeException("Account Number cannot be Negative...Terminating");
		}
		else
			accountNumber = x;
		if ( y == null)
		{
			throw new RuntimeException("Account Name cannot be Null...Terminating");
		}
		else 
			accountHolderName = y;
		if (z < 0 )
		{
			throw new RuntimeException("Account Balance cannot be Negative...Terminating");
		}
		else
			accountBalance = z;
	}
	
	BankAccount()
	{
		accountNumber = 100;
		accountHolderName = "Anand";
		accountBalance = 10000;
		mobileNumber = "9567103471";
	}
	
	BankAccount(int a, String aN, double b)
	{
		accountNumber = a;
		accountHolderName = aN;
		accountBalance = b;
	}
	
	BankAccount(int a, String aN, double b, String mobileNumber)
	{
		this(a,aN,b);
		this.mobileNumber=mobileNumber;
	}
	
	void printBankAccount()
	{
		System.out.println("\nThe Account Number is: " +accountNumber);
		System.out.println("Account Holder Name   : " +accountHolderName);
		System.out.println("Account Balance : " +accountBalance);
		System.out.println("Mobile Number : " +mobileNumber);
	}
	
	void setMobileNumber(String m) {
		this.mobileNumber= m;
	}
	
	void setAccountHolderName(String n) {
		this.accountHolderName= n;
	}
	
	double withdrawAmount(double amountToWithdraw) {
		
		this.withdraw(amountToWithdraw);
		return accountBalance;
	}
	
	double depositAmount(double amountToDeposit) {
		this.deposit(amountToDeposit);
		return accountBalance;
	}
	
	double withdraw(double amountToWithdraw) {
		System.out.println("\nWithdraw in progress " +amountToWithdraw);
		accountBalance = accountBalance - amountToWithdraw;
		System.out.println("Withdraw is done and the Account Balance is :" +accountBalance);
		return accountBalance;
	}
	
	double deposit(double amountToDeposit) {
		System.out.println("\nDeposit in progress " +amountToDeposit);
		accountBalance = accountBalance + amountToDeposit;
		System.out.println("Deposit is done and the Account Balance is :" +accountBalance);
		return accountBalance;
	}
	
}
