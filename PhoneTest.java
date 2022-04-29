
public class PhoneTest {

	public static void main(String[] args) {
		Phone myPhone = new Phone();
		myPhone.dial();
		byte speedNumber = 123;
		myPhone.dial(speedNumber);
		myPhone.dial("Anand");
		myPhone.dial("Anand", "Shruti");
		myPhone.dial("Anand", "101");
		boolean b = true;
		myPhone.dial("Anand", b);
	}
}

class Phone {
	void dial() {
		System.out.println("Dialing nowhere.......");
	}
	void dial(byte speedDial) {
		System.out.println("Dialing........." +speedDial);
	}
	void dial(String name) {
		System.out.println("Dialing to........" +name);
	}
	void dial(String name1, String name2) {
		System.out.println("Conference call with......" +name1+ " and " +name2);
	}
	void dial(String name1, byte b) {
		System.out.println("Conference call with......" +name1+ " and " +b);
	}
	void dial(String name1, boolean b) {
		System.out.println("Call with......" +name1+ " is connected " +b);
	}
	
	
}
