package sakhroman.lection09PracticeHome;
import acm.program.ConsoleProgram;


public class CompanyWorkerTester extends ConsoleProgram{
	
	public void run(){
		setFont("Times New Roman-14");
		
		CompanyWorker w1 = new CompanyWorker("Petro Ivanov", 35, "Warehouse", 2);
		CompanyWorker w2 = new CompanyWorker("Roman Petriv", 30, "Statistics",5);
		CompanyWorker w3 = new CompanyWorker("Olena Semenko", 21, "Finances",3);
		CompanyWorker w4 = new CompanyWorker("Alina Petrenko", 25, "Law Department");
		
		
		w4.changeDepartment("Finances");
		println(w1);
		println(w2);
		println(w3);
		println(w4);
		
		
		
		
	}

}
