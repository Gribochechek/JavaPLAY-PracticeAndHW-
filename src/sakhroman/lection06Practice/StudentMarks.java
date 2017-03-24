package sakhroman.lection06Practice;
import acm.program.ConsoleProgram;

public class StudentMarks extends ConsoleProgram{

	public void run(){
		
		this.setSize(800, 600);
		int j =0; /* A marks*/
		int k =0; /* B marks*/
		int l =0; /* C marks*/
		int m =0; /* D marks*/
		int n =0;/* E marks*/
		int studentsMark = 0;
		
		while(studentsMark!=999) {
			studentsMark = readInt("Введіть оцінку студента: ");
			if(studentsMark<=100&&studentsMark>=91)
				j++;
			else if(studentsMark<=90&&studentsMark>=81)
				k++;
			else if(studentsMark<=80&&studentsMark>=71)
				l++;
			else if(studentsMark<=70&&studentsMark>=61)
				m++;
			else if(studentsMark<=60&&studentsMark>=0)
				n++;
			else if(studentsMark==999){
							
			println("Кількість оцінок 'А' становить: "+j);
			println("Кількість оцінок 'B' становить: "+k);
			println("Кількість оцінок 'C' становить: "+l);
			println("Кількість оцінок 'D' становить: "+m);
			println("Кількість оцінок 'E' становить: "+n);
			}	
		}
	
	}
		
}

