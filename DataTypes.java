
public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=127;
		short s=32767;
		int i=2147483647;
		long l=242342342345345345L;
		double d=123.50F;
		float f=12.434232F;
		char c='C';
		
		System.out.println("\nb is " +b);
		System.out.println("Min value of Byte " +Byte.SIZE+ " bits");
		System.out.println("Min value of Byte " +Byte.MIN_VALUE);
		System.out.println("Max value of Byte " +Byte.MAX_VALUE);
		
		System.out.println("\ns is " +s);
		System.out.println("Min value of Short " +Short.SIZE+ " bits");
		System.out.println("Min value of Short " +Short.MIN_VALUE);
		System.out.println("Max value of Short " +Short.MAX_VALUE);
		
		System.out.println("\ni is " +i);
		System.out.println("Min value of Int " +Integer.SIZE+ " bits");
		System.out.println("Min value of Int " +Integer.MIN_VALUE);
		System.out.println("Max value of Int " +Integer.MAX_VALUE);
		
		System.out.println("\nl is " +l);
		System.out.println("Min value of Long " +Long.SIZE+ " bits");
		System.out.println("Min value of Long " +Long.MIN_VALUE);
		System.out.println("Max value of Long " +Long.MAX_VALUE);
		
		System.out.println("\nd is " +d);
		System.out.println("Min value of Double " +Double.SIZE+ " bits");
		System.out.println("Min value of Double " +Double.MIN_VALUE);
		System.out.println("Max value of Double " +Double.MAX_VALUE);
		
		System.out.println("\nf is " +f);
		System.out.println("Min value of Float " +Float.SIZE+ " bits");
		System.out.println("Min value of Float " +Float.MIN_VALUE);
		System.out.println("Max value of Float " +Float.MAX_VALUE);
		
		System.out.println("\nl is " +c);
		System.out.println("Min value of Char " +Character.SIZE+ " bits");
		System.out.println("Min value of Char " +Character.MIN_VALUE);
		System.out.println("Max value of Char " +Character.MAX_VALUE);
		
		for (int j = 1; j <= 255; j++) {
			System.out.println(j+" The Character is " +(char)j);
		}
	}

}
