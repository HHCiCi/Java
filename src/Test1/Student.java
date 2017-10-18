package Test1;

public class Student extends Person {
	
	

	private String major;
	/**
	 * @param n the student's name
	 * @param m the student's major
	 */

	public Student(String n,String m) {
		super(n);
		// TODO Auto-generated constructor stub
		major = m;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "a student majoring in " + major;
	}
	

	
}
