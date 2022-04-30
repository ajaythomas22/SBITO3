public class AbstractTest {
	
	public static void main(String[] args) {
		
// 		Instrument i = new Instrument();
// 		MusicalInstrument i = new MusicalInstrument();
//		StringBasedMusicalInstrument i = new StringBasedMusicalInstrument();
		Guitar g = new Guitar();
		g.utilize();
		g.play();
		g.tuneStrings();
		g.pluck();
		
		System.out.println("---------------------------");
		Violin v = new Violin();
		v.utilize();
		v.play();
		v.tuneStrings();
		v.bowing();
		
		System.out.println("---------------------------");
		Sitar s = new Sitar();
		s.utilize();
		s.play();
		s.tuneStrings();
		s.pluck();
	}
}

abstract class Instrument {
	
	abstract void utilize();
}

abstract class MusicalInstrument extends Instrument {
	
	abstract void play();
}

abstract class StringBasedMusicalInstrument extends MusicalInstrument {
	
	abstract void tuneStrings();
}

abstract class AirBasedMusicalInstrument extends MusicalInstrument {
	
	abstract void blow();
}

abstract class SurgicalMedicalInstrument extends MusicalInstrument {
	
	abstract void sterilize();
}

abstract class PathalogicalMedicalInstrument extends MusicalInstrument {
	
	abstract void read();
	abstract void electricitySupply();
	abstract void scan();	
}

class Guitar extends StringBasedMusicalInstrument {

	@Override
	void tuneStrings() {
		System.out.println("Tuning the Guitar Strings");
	}

	@Override
	void play() {
		System.out.println("Playing the Guitar...");
	}

	@Override
	void utilize() {
		System.out.println("Utilizing the Guitar....");
	}

	void pluck() {
		System.out.println("Plucking the Guitar....");
	}
}

class ElectronicGuitar extends Guitar {

}

class Violin extends StringBasedMusicalInstrument {

	@Override
	void tuneStrings() {
		System.out.println("Tuning the Violin Strings");
	}

	@Override
	void play() {
		System.out.println("Playing the Violin...");
	}

	@Override
	void utilize() {
		System.out.println("Utilizing the Violin....");
	}

	void bowing() {
		System.out.println("Bowing the Violin....");
	}
}

class Cello extends Violin {

}

class Sitar extends StringBasedMusicalInstrument {

	@Override
	void tuneStrings() {
		System.out.println("Tuning the Sitar Strings");
	}

	@Override
	void play() {
		System.out.println("Playing the Sitar...");
	}

	@Override
	void utilize() {
		System.out.println("Utilizing the Sitar....");
	}

	void pluck() {
		System.out.println("Plucking the Sitar....");
	}
}

class Flute extends AirBasedMusicalInstrument {

	@Override
	void blow() {
		
	}

	@Override
	void play() {
		
		System.out.println("Playing the Flute...");
	}

	@Override
	void utilize() {
		
		System.out.println("Utilizing the Flute....");
	}
}

class Saxophone extends AirBasedMusicalInstrument {

	@Override
	void blow() {
		
	}

	@Override
	void play() {
		
		System.out.println("Playing the Saxophone...");
	}

	@Override
	void utilize() {
		
		System.out.println("Utilizing the Saxophone....");
	}
}

class BagPipe extends AirBasedMusicalInstrument {

	@Override
	void blow() {
		
	}

	@Override
	void play() {
		
		System.out.println("Playing the BagPipe...");
		
	}

	@Override
	void utilize() {
		
		System.out.println("Utilizing the BagPipe....");
	}
}

class Needle extends SurgicalMedicalInstrument {

	@Override
	void sterilize() {
			
	}

	@Override
	void play() {
		
		System.out.println("Playing the Needle...");
		
	}

	@Override
	void utilize() {
		
		System.out.println("Utilizing the Needle....");
	}
}

class Cutter extends SurgicalMedicalInstrument {

	@Override
	void sterilize() {

	}

	@Override
	void play() {
		
		System.out.println("Playing the Cutter...");
		
	}

	@Override
	void utilize() {
		
		System.out.println("Utilizing the Cutter....");
	}
}
	
class GlucoMeter  extends PathalogicalMedicalInstrument {

	@Override
	void read() {
	
	}

	@Override
	void electricitySupply() {
	
	}

	@Override
	void scan() {
	
	}

	@Override
	void play() {
		
		System.out.println("Playing the GlucoMeter...");
	
	}

	@Override
	void utilize() {

		System.out.println("Utilizing the GlucoMeter....");
	}
	
}

class MRI  extends PathalogicalMedicalInstrument {

	@Override
	void read() {
	
	}

	@Override
	void electricitySupply() {
	
	}

	@Override
	void scan() {
	
	}

	@Override
	void play() {
		
		System.out.println("Playing the MRI...");
	
	}

	@Override
	void utilize() {

		System.out.println("Utilizing the MRI....");
	}
	
}

class CTScanner  extends PathalogicalMedicalInstrument {

	@Override
	void read() {
	
	}

	@Override
	void electricitySupply() {
	
	}

	@Override
	void scan() {
	
	}

	@Override
	void play() {
		
		System.out.println("Playing the CTScanner...");
	
	}

	@Override
	void utilize() {

		System.out.println("Utilizing the CTScanner....");
	}
	
}


