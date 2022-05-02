import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideTest {

	public static void main(String[] args) {

		MyCalculator cal = new MyCalculator();
		Scanner scan = new Scanner(System.in);
		int x=0;
		do {
			
			cal.divide();
			System.out.println("Press 5 to Exit or 1 to Continue");
			System.out.println("---------------------------------");
			x = scan.nextInt();
			
		} while (x!=5);
		
//		String str1 = "SBI";
//		System.out.println("Character at 5th Location " +str1.charAt(5));
		
//		String str2 = null;
//		System.out.println(str2.toUpperCase());
//
//		int array[]= {10,20,30};
//		System.out.println("Array 5th Value : "+array[4]);
//		}
	}
}

class MyCalculator {
	
	void divide() {
		
		int x = 0, y =0 , z=0;
		Scanner scan = new Scanner(System.in);
		try {
			
			System.out.println("Enter the value of X: ");
			x = scan.nextInt();
			System.out.println("Enter the value of Y: ");
			y = scan.nextInt();
			z = x / y;
			System.out.println("Z: " +z);
		
		}
		catch (InputMismatchException e) {
			
			System.out.println("Please input value in Integer!!!");
		}
		catch (ArithmeticException e) {
			
			System.out.println("The input value is either ZERO or Invalid ");
		}
		
		
	}
	
}
