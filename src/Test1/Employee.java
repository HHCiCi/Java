package Test1;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee extends Person {

	private double salary;
	private Date hiredate;
	
	public Employee(String n,double s,int year,int month,int day) {
		super(n);
		salary = s;
		GregorianCalendar calander = new GregorianCalendar(year,month-1,day);
	    hiredate = calander.getTime();
	}
	
	public double getSalary(){
		return salary;
	}
	public Date gethiredate(){
		return hiredate;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return String.format("an employee with a salary of $%.2f",
				salary);
	}
	
    public void raisesalary(double bypercent){
    	
    	double raise =salary*bypercent/100;
    	salary +=salary;
    	
    }
    

	
}
