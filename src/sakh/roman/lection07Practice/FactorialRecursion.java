package sakh.roman.lection07Practice;


import acm.program.ConsoleProgram;


public class FactorialRecursion  extends ConsoleProgram {
	
	public void run(){
		int n = readInt("Input n");
		println(n + "!="+nfactorialRecurs(n));
		println(n + "!="+nfactorial(n));
		
	}
	
	private int nfactorial(int n){
		int res=1;
		for(int i=1; i<=n; i++){
			 res = res*i;
		 }
		return res;
	}

	private int nfactorialRecurs(int n){
		if(n<=1) return 1;
		return n*nfactorialRecurs(n-1);
		
	}
	
	
	
}
