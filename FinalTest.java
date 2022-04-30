
public class FinalTest {

	public static void main(String[] args) {
		
		final float PI = 3.14f;
		System.out.println("PI " +PI);
		//PI = 3.21F;
		Chess c = new Chess();
		c.moveBishop();	
		c.moveKnight();
		
//		GraphicalChess gc = new GraphicalChess();
//		gc.moveKnight();
		
//		Chess cg = new GraphicalChess();
//		cg.moveKnight();
	}
}
	
final class Chess {
		
		void moveBishop() { 
			System.out.println("C- Bishop is moving in Cross Bi-directional...");
		}
		void moveKnight() { 
			System.out.println("C- Knight is moving in L Shape..any Direction/Jump Over...");
		}
	}

//class GraphicalChess extends Chess {
//	
//		void moveMyBishop() {
//
//			System.out.println("GC- My own Math logic to move bishop in ");
//		
//		}
//		void moveKnight() {
//			
//			System.out.println("GC- Knight is moving in L Shape..any Direction/Jump Over...");
//		
//		}
//}

