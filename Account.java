
public class Account {

	public static void main(String[] args) {
		ParentAccount parentObj = new ParentAccount(101, "Anand", 10000);

		SavingsAccount savObj = new SavingsAccount(102, "Sruthi", 20000, 3.5);

		FixedDepositAccount fixObj = new FixedDepositAccount(103, "Ajay", 30000, 3.5, 5);

		CurrentAccount curObj = new CurrentAccount(104, "Sarath", 40000, "Partnership");

		CreditAccount creObj1 = new CreditAccount(105, "Suraj", 50000, 60000);
		CreditAccount creObj2 = new CreditAccount(106, "Rahul", 70000, 60000);
		System.out.println("------------------------");

		parentObj.printAccount();
		System.out.println("------------------------");

		savObj.printAccount();
		System.out.println("The Simple Interest is " + savObj.calculateSimpleInterest());
		System.out.println("------------------------");

		fixObj.printAccount();
		System.out.println("The Maturity Amount is " + fixObj.maturityAmount());
		System.out.println("------------------------");

		curObj.printAccount();
		curObj.withdraw(5000);
		curObj.deposit(4000);
		double curBal = curObj.getBalance();
		System.out.println("The Current Account Balance is " + curBal);
		System.out.println("------------------------");

		creObj1.printAccount();
		creObj1.calculateCreditBalance();
		System.out.println("------------------------");

		creObj2.printAccount();
		creObj2.calculateCreditBalance();
		
		

	}
}

class ParentAccount {

	private int accountNumber;
	private String accountHolderName;
	protected double accountBalance;

	ParentAccount(int a, String b, double c) {

		System.out.println("ParentAccount(int,String,double)...Constructor invoked....");

		if (a < 0)

		{
			throw new RuntimeException("Account number cannot be in negative...terminating..");
		}

		else
			accountNumber = a;

		if (b == null) {

			throw new RuntimeException("Account holder name cannot be null...terminating..");
		} else
			accountHolderName = b;

		if (c < 0) {
			throw new RuntimeException("Account Balance cannot be in negative...terminating..");
		}

		else
			accountBalance = c;
	}

	void printAccount() {
		System.out.println("The Account Number: " + accountNumber);
		System.out.println("The Account Holder Name " + accountHolderName);
		System.out.println("The Account Balance " + accountBalance);
	}

	double withdraw(double amountToWithdraw) {
		if (amountToWithdraw > accountBalance) {
			throw new RuntimeException("Insufficient funds....");
		}
		System.out.println("Withdraw in progresss..." + amountToWithdraw);
		accountBalance = accountBalance - amountToWithdraw;
		System.out.println("Withdraw is done...");
		return accountBalance;
	}

	double deposit(double amountToDeposit) {
		if (amountToDeposit > 50000) {
			throw new RuntimeException("Please provide the PAN OR Form60");
		}
		System.out.println("Deposit in progresss..." + amountToDeposit);
		accountBalance = accountBalance + amountToDeposit;
		System.out.println("Deposit is done...");
		return accountBalance;
	}

	double getBalance() {
		return accountBalance;
	}
}

class SavingsAccount extends ParentAccount {

	protected double rateOfInterest;

	SavingsAccount(int x, String y, double z, double r) {
		super(x, y, z);
		System.out.println("SavingsAccount(int,String,double,double)....Contructor invoked");

		if (r < 0) {
			throw new RuntimeException("Account rate cannot be Negative...Terminating");
		} else
			rateOfInterest = r;
	}

	void printBankAccount() {
		super.printAccount();
		System.out.println("Account Rate of Interest: " + rateOfInterest);
	}

	double calculateSimpleInterest() {
		return (super.accountBalance * 1 * rateOfInterest) / 100;
	}
}

class FixedDepositAccount extends SavingsAccount {

	private int tenure;

	FixedDepositAccount(int x, String y, double z, double r, int t) {
		super(x, y, x, r);
		System.out.println("FixedDepositAccount(int,String,double,double,int)--- Contructor invoked");
		if (t < 0) {
			throw new RuntimeException("The tenure cannot be negative...Terminating");
		} else
			tenure = t;
	}

	void printAccount() {
		super.printAccount();
		System.out.println("Account Tenure: " + tenure);
	}

	double maturityAmount() {
		double a = Math.pow((1 + rateOfInterest / 100), tenure);
		double p = accountBalance * a;
		return p;
	}
}

class CurrentAccount extends ParentAccount {

	String ownerType;

	CurrentAccount(int x, String y, double z, String p) {

		super(x, y, z);
		System.out.println("CurrentAccount(int,String,double,String)...Constructor invoked");
		ownerType = p;
	}

	void printAccount() {
		super.printAccount();
		System.out.println("Owner Type of Current Account: " + ownerType);
	}

	double withdraw(double withdrawAmount) {
		super.withdraw(withdrawAmount);
		return withdrawAmount;
	}

	double deposit(double depositAmount) {
		super.deposit(depositAmount);
		return depositAmount;
	}

	double getBalanceCur() {
		return accountBalance;
	}
}

class CreditAccount extends ParentAccount {

	int creditLimit;

	CreditAccount(int x, String y, double z, int c) {

		super(x, y, z);
		System.out.println("CreditAccount(int,String,double,int)...Constructor invoked");
		if (c < 0) {
			throw new RuntimeException("The credit Limit should not be Negative...Terminating");
		} else
			creditLimit = c;
	}

	void printAccount() {
		super.printAccount();
		System.out.println("The Credit Limit is " + creditLimit);
	}

	void calculateCreditBalance() {
		if (creditLimit < accountBalance) {
			System.out.println("The Account is Overdrawn");
		} else
			System.out.println("The Amount " + (creditLimit - accountBalance) + " is available for withdrawal");

	}
}
