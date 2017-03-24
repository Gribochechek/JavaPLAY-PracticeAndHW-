package sakhroman.lection08Lab;
import acm.program.ConsoleProgram;


public class Task6Divider  extends ConsoleProgram{
		
	public void run(){
		
	
	int dividableNum = readInt("¬вед≥ть число: ");
	
	divider(dividableNum);
	println("FINISH!!!");
	}

	private int divider( int i) {
		
		while(i!=1){
			if(i%2==0){
				i=i/2;
			println(i);	
			}
			else {
				i=i*3+1;
				println(i);
			}
		
		}
		return i;
				
	}
	

}
