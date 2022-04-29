
public class ProducesARelationshipTest {

	public static void main(String[] args) {
		
		DigestiveSystem ds = new DigestiveSystem();
		Ingestion i = ds.inject();
		Digestion d = i.digest(null);
		Absorption a = d.absorb(null);
		Elimination e1 = a.eliminate(null);	
		e1.digestionComplete();
		
		Elimination e2 = ds.display();
	}
}

class Mouth { }
class Esophagus { }
class Stomach { }
class Chewing { }
class ChemicalInjection { }
class WateDisposal { }

class DigestiveSystem {
	
	Mouth m = new Mouth();
	Esophagus e = new Esophagus();
	Stomach s = new Stomach();
	
	Elimination display( ) {
		DigestiveSystem ds = new DigestiveSystem();
		Ingestion i = ds.inject();
		Digestion d = i.digest(null);
		Absorption a = d.absorb(null);
		Elimination e = a.eliminate(null);	
		e.digestionComplete();
		return e;
	}
	
	Ingestion inject( ) {
		Ingestion i = new Ingestion();
		return i;
	}
}

class Ingestion extends DigestiveSystem { 
	
	Digestion digest(Chewing c) {
		Digestion d = new Digestion();
		return d;
	}
}
class Digestion { 
	
	Absorption absorb(ChemicalInjection c) {
		Absorption a = new Absorption();
		return a;
	}
}
class Absorption {
	
	Elimination eliminate(WateDisposal wD) {
		Elimination e = new Elimination();
		return e;
	}
}
class Elimination {

	void digestionComplete() {
		System.out.println("The Food is Digested");
	}
	}
