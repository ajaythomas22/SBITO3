
public class FootballTurfBooking {

	public static void main(String[] args) {
		Bookings book = new Bookings();
		book.booking1();
		book.booking2(1400, 1.5, 12);

		//double exp = book.booking3(2000, 2, 14);
		System.out.println("Expense per Player is : " + book.booking3(2000, 2, 14));
		System.out.println("---------------------------------");

		double exp1 = book.booking4();
		System.out.println("Expense per Player is : " + exp1);
		System.out.println("---------------------------------");
	}
}

class Bookings {

	void booking1() {
		int money = 1000;
		double time = 1;
		int noOfPlayers = 10;
		System.out.println("The Booking is successfull..");
		System.out.println("The Amount paid is " + money + " for " + time + " Hour with " + noOfPlayers + " Players");
		int Expense = money / noOfPlayers;
		System.out.println("Expense per Player is : " + Expense);
		System.out.println("---------------------------------");

	}

	void booking2(int money, double time, int noOfPlayers) {
		double Expense = money / noOfPlayers;
		System.out.println("The Booking is successfull..");
		System.out.println("The Amount paid is " + money + " for " + time + " Hour with " + noOfPlayers + " Players");
		System.out.println("Expense per Player is : " + Expense);
		System.out.println("---------------------------------");
	}

	double booking3(int money, double time, int noOfPlayers) {
		double Expense = money / noOfPlayers;
		System.out.println("The Booking is successfull..");
		System.out.println("The Amount paid is " + money + " for " + time + " Hour with " + noOfPlayers + " Players");
		return Expense;

	}

	double booking4() {
		int money = 2400;
		double time = 2.5;
		int noOfPlayers = 16;
		double Expense = money / noOfPlayers;
		System.out.println("The Booking is successfull..");
		System.out.println("The Amount paid is " + money + " for " + time + " Hour with " + noOfPlayers + " Players");
		return Expense;

	}
}