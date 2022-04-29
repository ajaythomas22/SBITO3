
public class SmartWatch {

	public static void main(String[] args) {

		System.out.println("------------------------------");
		System.out.println("\tMY SMARTWATCH");
		System.out.println("------------------------------");
		Functionality func = new Functionality();
		func.currentTime();
		func.currentDay("Tue");
		func.beatsPerMinute(110);
		double cal = func.calories();
		System.out.println("You have burned " + cal + "k Calories as of now");

		func.currentTime();
		func.currentDay("Sun");
		func.beatsPerMinute(180);
		double cal1 = func.calories();
		System.out.println("You have burned " + cal1 + "k Calories as of now");

	}
}

class Functionality {

	int minutes = 30;
	int hours = 17;
	String day;
	int BPM;
	int numberOfSteps;
	double caloriesBurned;

	void currentTime() {
		System.out.println("\nThe Present Time is: " + hours + " hours " + minutes + " minutes");
	}

	void currentDay(String Day) {
		if (Day == "Mon") {
			System.out.println("The Present Day is Monday");
		} else if (Day == "Tue") {
			System.out.println("The Present Day is Tuesday");
		} else if (Day == "Wed") {
			System.out.println("The Present Day is Wednesday");
		} else if (Day == "Thu") {
			System.out.println("The Present Day is Thurdsay");
		} else if (Day == "Fri") {
			System.out.println("The Present Day is Friday");
		} else if (Day == "Sat") {
			System.out.println("The Present Day is Saturday");
		} else if (Day == "Sun") {
			System.out.println("The Present Day is Sunday");
		} else {
			System.out.println("You have entered an Invalid Day");
		}
	}

	int beatsPerMinute(int BPM) {

		if (BPM > 100 && BPM < 170) {
			System.out.println("Your BPM " + BPM + " is under Control");
		} else
			System.out.println("Your BPM " + BPM + " is Abnormal.. Be Cautious!!!!");

		return BPM;
	}

	double calories() {
		numberOfSteps = 5000;
		int MET = 4;
		caloriesBurned = (numberOfSteps * 3.5 * MET) / 200;
		return caloriesBurned;
	}

}
