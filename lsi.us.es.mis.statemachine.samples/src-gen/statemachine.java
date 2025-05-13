public class App {
	
	public static void main(String[] args) {
		App app = new App();
		
		
		// The statement below will succeed
		app.process("AABC"); 
		
		// The statement below will fail because
		// there is no transition from A to C
		// in the state machine
		app.process("ACB"); 
	}
	
				public void process(String str) {
		if (str.isEmpty()) return;
if (str.charAt(0) == 'A') {
	stateA(str.substring(1));
	return;
}
if (str.charAt(0) == 'B') {
	stateB(str.substring(1));
	return;
}
if (str.charAt(0) == 'C') {
	stateC(str.substring(1));
	return;
}
		
		throw new IllegalStateException();
	}

	
public void stateA(String str) {
	if (str.isEmpty()) return;
	
if (str.charAt(0) == 'A') {
	stateA(str.substring(1));
	return;
}
if (str.charAt(0) == 'A') {
	stateA(str.substring(1));
	return;
}
	throw new IllegalStateException();
}
	
public void stateB(String str) {
	if (str.isEmpty()) return;
	
if (str.charAt(0) == 'B') {
	stateB(str.substring(1));
	return;
}
	throw new IllegalStateException();
}
	
public void stateC(String str) {
	if (str.isEmpty()) return;
	
if (str.charAt(0) == 'C') {
	stateC(str.substring(1));
	return;
}
	throw new IllegalStateException();
}
}
