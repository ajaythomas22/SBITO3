
public class TestInterface2 {

	public static void main(String[] args) {

		Teacher t = new Teacher();
		t.play();
		t.listen();
		t.teach();
		
		Principal p = new Principal();
		p.instruct();
		p.listen();
		p.play();
		p.teach();
		p.monitor();
		
		Teaching te1 = new Teacher();
		Teaching te2 = new Principal();
		te1.teach();
		te2.teach();
		
		Listening le = new Teacher();
		le.listen();
		
		School.curricularActivities(new Principal(), new Principal());
		School.extraCurricularActivities(new Principal());
	}
}

class School {
	static void curricularActivities(Teaching t, Listening l) {
		
		t.teach();
		l.listen();
		
		if(t instanceof Principal && l instanceof Principal) {
			Principal pe1 = (Principal)t;
			Principal pe2 = (Principal)l;
			pe1.instruct();
			pe1.listen();
			pe1.play();
			pe1.teach();
			pe1.monitor();
			
			pe2.instruct();
			pe2.listen();
			pe2.play();
			pe2.teach();
			pe2.monitor();
			
		}
		
	}
	static void extraCurricularActivities(Playing p) {
		
		p.play();
		
		if(p instanceof Principal) {
			Principal pe = (Principal)p;
			pe.instruct();
			pe.listen();
			pe.play();
			pe.teach();
			pe.monitor();
		}
	}
}

interface Teaching {
	
	void teach();
}
interface Listening {
	
	void listen();
}
interface Playing {
	
	void play();
}
interface Instructing {
	
	void instruct();
}
interface Monitoring {
	
	void monitor();
}

class Teacher implements Teaching,Listening,Playing {
	
	public void teach() { }
	
	public void listen() { }
	
	public void play() { }
	
}
class Principal extends Teacher implements Monitoring, Instructing {
	
	public void instruct() { }
	
	public void monitor() { }
}