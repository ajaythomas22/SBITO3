
public class FootballTurfBooking {

	public static void main(String[] args) {
		Bookings book1 = new Bookings();
		book1.booking1();
		book1.booking2(1400, 1.5, 12);
		
//		Bookings book2 = new Bookings(2000, 2 , 14);
//		book2.booking3(book1);
//		book2.booking4();
	}
}

class Bookings {
	int money = 1000;
	double time = 1;
	int noOfPlayers = 10;
	
	static int noOfBookings;
	static int totalMoney;
	
	public Bookings(int i, double  j, int k) {
		money = i;
		time = j;
		noOfPlayers = k;
	}

	public Bookings() {
		money = 1000;
		time = 1;
		noOfPlayers = 10;
	}

	void booking1() {
		System.out.println("-------------------------------------------");
		System.out.println("\tFOOTBALL TURF BOOKING");
		System.out.println("-------------------------------------------");
		System.out.println("\t    EXPENSE SHEET");
		System.out.println("-------------------------------------------");
		System.out.println("The Booking is successfull..");
		System.out.println("The Amount paid is " + money + " for " + time + " Hour with " + noOfPlayers + " Players");
		int Expense = money / noOfPlayers;
		System.out.println("Expense per Player is : " + Expense);
		++noOfBookings;
		System.out.println("Total Bookings for the Day: " +noOfBookings);
		totalMoney = totalMoney + money;
		System.out.println("TOTAL AMOUNT RECEIVED: "+ totalMoney);
		System.out.println("---------------------------------");
	}

	void booking2(int money, double time, int noOfPlayers) {
		double Expense = money / noOfPlayers;
		System.out.println("The Booking is successfull..");
		System.out.println("The Amount paid is " + money + " for " + time + " Hour with " + noOfPlayers + " Players");
		System.out.println("Expense per Player is : " + Expense);
		++noOfBookings;
		System.out.println("Total Bookings for the Day: " +noOfBookings);
		totalMoney = totalMoney + money;
		System.out.println("TOTAL AMOUNT RECEIVED: "+ totalMoney);
		System.out.println("---------------------------------");
	}

//	void booking3(Bookings book) {
//			
//	}

	void booking4() {
		int money = 2400;
		double time = 2.5;
		int noOfPlayers = 16;
		int Expense = money / noOfPlayers;
		System.out.println("The Booking is successfull..");
		System.out.println("The Amount paid is " + money + " for " + time + " Hour with " + noOfPlayers + " Players");
		++noOfBookings;
		System.out.println("Expense per Player is : " + Expense);
		System.out.println("Total Bookings for the Day: " +noOfBookings);
		totalMoney = totalMoney + money;
		System.out.println("TOTAL AMOUNT RECEIVED: "+ totalMoney);
		System.out.println("---------------------------------");
	}
}