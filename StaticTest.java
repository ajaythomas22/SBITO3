class Kite {
	private String kiteColor;
	private String kiteOwner;
	private int length;
	boolean flyingStatus;
	
	static int kiteCount; //class's data

	public Kite(String kiteColor, String kiteOwner, int length, boolean status) {
		super();
		this.kiteColor = kiteColor;
		this.kiteOwner = kiteOwner;
		this.length = length;
		flyingStatus = status;
		++kiteCount;
	}

	@Override
	public String toString() {
		return "Kite [kiteColor=" + kiteColor + ", kiteOwner=" + kiteOwner + ", length=" + length + "]";
	}
	
	void fly() {
		System.out.println(kiteColor+ " color Kite is flying by " +kiteOwner+ " length is " +length+ " flying status " +flyingStatus);
	}

	void kiteFight(Kite ref) {
		for(int i =0; i <10 ; i++) {
			double val = Math.random()%100;
			System.out.println("Kite fight started between "+kiteOwner+" and "+ref.kiteOwner+" "+val);
			if(val > 0.98) {
				ref.flyingStatus = false;
				kiteCount--;
				break;
			}
			else if (val < 0.10) {
				ref.flyingStatus = false;
				kiteCount--;
				break;
			}
			else if (val >= 0.60 && val <0.70) {
				flyingStatus = false;
				ref.flyingStatus = false;
				kiteCount = kiteCount - 2;
				break;
			}
		}
	}
}
public class StaticTest {

	public static void main(String[] args) {
		
		System.out.println("Kite Count is " +Kite.kiteCount);
		
		Kite k1 = new Kite ("Red", "Jack", 50, true);
		Kite k2 = new Kite ("Blue", "Jane", 60, true);
		Kite k3 = new Kite ("Black", "Jill", 70, true);
		
		System.out.println("Kite Count is " +Kite.kiteCount);
		
		k1.fly();
		k2.fly();
		k3.fly();
		
		k1.kiteFight(k2);
		
		System.out.println("Kite Count is "+Kite.kiteCount);
	}
}
