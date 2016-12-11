package sakh.roman.lection07Practice;
import acm.program.ConsoleProgram;


public class CNK extends ConsoleProgram  {
	
	public void run(){
		
		int n =readInt("Enter n: ");
		int k = readInt("Enter k:");
		println("C(n,k): "+ cnkN(n,k));
		println("C(n,k): "+ cnkR(n,k));
		
		
	}

	private int cnkR(int n, int k) {
		if(n<=1||k==0||n==k) return 1;
		return cnkR(n-1, k-1)+cnkR(n-1, k);
	}

	private int cnkN(int n, int k) {
		int res= nfactorialRecurs(n)/nfactorialRecurs(k)*nfactorialRecurs(n-k);
		return res;
	}

	private int nfactorialRecurs(int n){
		if(n<=1) return 1;
		return n*nfactorialRecurs(n-1);
		
	}
}
