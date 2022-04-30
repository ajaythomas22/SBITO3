public class TestOverride {

	public static void main(String[] args) {
		
		Acc a = new Acc();
		a.PrintAccount();
		if (a instanceof SBAccount) {
			System.out.println("A is pointing to the Class SBAccount");
		}
		else {
			System.out.println("A is NOT pointing to the Class SBAccount");
		}
		
		
		SBAccount s = new SBAccount();
		a = new SBAccount();
		a.PrintAccount();
		s.changeName();
		
		
		FDAccount f = new FDAccount();
		if (a instanceof FDAccount) {
			System.out.println("A is pointing to the Class FDAccount");
		}
		else {
			System.out.println("A is NOT pointing to the Class FDAccount");
		}
		a = new FDAccount();
		if (a instanceof FDAccount) {
			System.out.println("A is pointing to the Class FDAccount");
		}
		else {
			System.out.println("A is NOT pointing to the Class FDAccount");
		}
		
		
		a.PrintAccount();
		System.out.println("Called via GRANDCHILD CLASS");
		f.changeName();
		f.PrintAccount();
		
		if (a instanceof Acc) {
			System.out.println("A is pointing to the Class Acc");
		}
		else {
			System.out.println("A is NOT pointing to the Class Acc");
		}
				
		//f.PrintAccount();
	}
}

class Acc {
	
	protected int accountNumber = 101;
	protected String accountHolderName = "Anand" ;
	protected double accountBalance = 50000;
	
	void PrintAccount() {
		
		System.out.println("\nPARENT CLASS CALLED");
		System.out.println("Account Number: " +accountNumber);
		System.out.println("Account Name  : " +accountHolderName);
		System.out.println("Account Balance : " +accountBalance);
		System.out.println("--------------------------------");
		
	}
}

class SBAccount extends Acc {
	
	void PrintAccount() {
		
		System.out.println("\nCHILD CLASS CALLED");
		System.out.println("Account Number: " +accountNumber);
		System.out.println("Account Name  : " +accountHolderName);
		System.out.println("Account Balance : " +accountBalance);
		System.out.println("--------------------------------");
		
	}	
	
	void changeName() {
		
		String name = "Shruti";
		this.accountHolderName= name;
		System.out.println("NEW NAME IN CHILD CLASS: " +name);
	}
}

class FDAccount extends SBAccount {
	
	void PrintAccount() {
		
		System.out.println("\nGRANDCHILD CLASS CALLED");
		System.out.println("Account Number: " +accountNumber);
		System.out.println("Account Name  : " +accountHolderName);
		System.out.println("Account Balance : " +accountBalance);
		System.out.println("--------------------------------");
		
	}	
}