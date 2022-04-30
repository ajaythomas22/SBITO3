
public class AssociationTest {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount(101, "Anand", 50000, "9567103471");
		ba.printBankAccount();
		ba.deposit(5000);
		ba.withdraw(2500);
		ba.printBankAccount();
		
		System.out.println("-----------------------------");
		BankAdmin admin = new BankAdmin();
		admin.setAccountHolderName(ba, "Sruthi");
		admin.changeMobileNumber(ba, "8943129884");
		admin.withdrawAmount(ba, 10000);
		admin.depositAmount(ba, 5000);
		ba.printBankAccount();
}

class BankAdmin {
	
//	BankAccount processApplication(Application app) {
//		BankAccount ba1 = new BankAccount(101, "Jac", 50000, "9567103471");
//		return ba1;
//	}
}

	void changeMobileNumber(BankAccount ba, String m) {
		ba.setMobileNumber(m);
		System.out.println("Mobile Number Changed");
	}
	
	void setAccountHolderName(BankAccount ba, String n) {
		ba.setAccountHolderName(n);
		System.out.println("Account Holder Name Changed");
	}
	
	void withdrawAmount(BankAccount ba, double wA) {
		ba.withdrawAmount(wA);
	}
	void depositAmount(BankAccount ba, double dA) {
		ba.depositAmount(dA);
	}
}