package sakh.roman.lection09PracticeHome;

public class CompanyWorker {

	private static String companyName= "CasinoVolcano";
	private static int defaultSalary=10000;
	
	private String name;
	private int age;
	private String departmentName;
	private int workingTerm;
	private int salary ;
	
	
	public CompanyWorker(String name, int age, String departmentName, int workingTerm){
		this.name=name;
		this.age=age;
		this.departmentName=departmentName;
		this.salary= getSalary(defaultSalary);
		this.workingTerm=workingTerm;
				
	}
	public CompanyWorker(String name, int age, String departmentName){
		this.name=name;
		this.age=age;
		this.departmentName=departmentName;
		this.salary= getSalary(defaultSalary);
	}
	
	private int getSalary(int defaultSalary) {
		if(age>0&&age<25)
		salary=defaultSalary+1000;
		else salary=defaultSalary+30000;
		return salary;
	}

	/**
	 * this method changes the department where the worker works
	 * @param departmentName is the name of department as a text string
	 */
	public void changeDepartment(String departmentName){
		this.departmentName=departmentName;
		}
	
	private int changeSalary(){
		if(workingTerm>2&&workingTerm<5){
			salary=defaultSalary+2000;
		}
		return salary;
	}
	
		
	

	@Override
	public String toString() {
		return " Працівник [ПІБ:" + name + " Вік: " + age
				+ " Підрозділ: " + departmentName + " Стаж роботи: "
				+ workingTerm + " Заробітна плата: " + salary + "]";
	}
	
	
}

