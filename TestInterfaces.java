
public class TestInterfaces {

	public static void main(String[] args) {
		
		D dObj = new D();
		dObj.add1();
		Z zObj = new Z();
	}

}
 abstract class X 
 {
	 abstract void addition1();
	 abstract void addition2();
	 abstract void addition3();
	 
	 void add1() { };
	 void add2() { };
	 void add3() { };
	 void add4() { };
	 void add5() { };
 }
 
 class Y extends X {

	@Override
	void addition1() { }

	@Override
	void addition2() { }

	@Override
	void addition3() { } 
	void sub1() { }
	void sub2() { }
	void sub3() { }
	void sub4() { }
	void sub5() { }
	void sub6() { }
	
 }
 
 interface A {
	 
	 void mult1(); 
	 void mult2(); 
	 void mult3(); 
 }
 
 interface B extends A {
	 
	 void div1();
	 void div2();
	 void div3();
	 void div4();
	 void div5();
 }
 interface P {
	 
	 void integrate1();
	 void integrate2();
	 void integrate3();
	 void integrate4();
	 void integrate5();
 }
 
 interface Q extends P {
	 
	 void diff1();
	 void diff2();
	 void diff3();
	 void diff4();
	 void diff5();
 }
 interface R extends Q {
	 
	 void sum1();
	 void sum2();
	 void sum3();
	 void sum4();
	 void sum5();
 }
 class Z extends Y implements B,R {

	@Override
	public void mult1() { }

	@Override
	public void mult2() { }

	@Override
	public void mult3() { }

	@Override
	public void diff1() { }

	@Override
	public void diff2() { }

	@Override
	public void diff3() { }

	@Override
	public void diff4() { }

	@Override
	public void diff5() { }

	@Override
	public void integrate1() { }

	@Override
	public void integrate2() { }

	@Override
	public void integrate3() { }

	@Override
	public void integrate4() { }

	@Override
	public void integrate5() { }

	@Override
	public void sum1() { }

	@Override
	public void sum2() { }

	@Override
	public void sum3() { }

	@Override
	public void sum4() { }

	@Override
	public void sum5() { }

	@Override
	public void div1() { }

	@Override
	public void div2() { }

	@Override
	public void div3() { }

	@Override
	public void div4() { }

	@Override
	public void div5() { }
	 
 }

 class D extends Z {
 }

