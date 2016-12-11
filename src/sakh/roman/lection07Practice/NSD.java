package sakh.roman.lection07Practice;
import acm.program.ConsoleProgram;


public class NSD extends ConsoleProgram {
	
	public void run() {
		
		int a =readInt("Enter A: ");
		int b = readInt("Enter B:");
		println("NSD: "+ nsd(a,b));
		
	}

	private int nsd(int a, int b) {
		if(b==0) return a;
		if(a%b==0) return b;
		return nsd(b, a%b);
		
	}
 

}
