/* Four types of Functions :
 * 1) Functions without arguments/parameters and without return value
 * 2) Functions with arguments/parameters But without return value
 * 3) Functions with arguments/parameters and with return value
 * 4) Functions without arguments/parameters But returns value
 *  */
public class Test {

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		
		calc.add1();
		
		calc.add2(100, 100);
		
		int ans1 = calc.add3(150,150);
		System.out.println("\nFunction Type 3: The sum of Two numbers is " +ans1);
		
		int ans2 = calc.add4();
		System.out.println("\nFunction Type 4: The sum of Two numbers is " +ans2);
	}

}
// All classes are child of Object class
class Calculator {
	
	void add1() {
		int x = 50;
		int y = 50;
		int z = x+y;
		System.out.println("Function Type 1: The sum of Two numbers is " +z);
	}
	
	void add2(int x, int y) {
		int z = x + y;
		System.out.println("\nFunction Type 2: The sum of Two numbers is " +z);
	}
	
	int add3(int x, int y) {
		int z = x + y;
		return z;
	}
	
	int add4() {
		int x = 200;
		int y = 200;
		int z = x + y;
		return z;
	}
}
