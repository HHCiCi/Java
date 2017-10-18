package Test1;

/**
 * This program demonstrate abstract classes.
 * @2017-08-23
 * @author wb-hehuan.c
 *
 */
public class PersonTest {

	public static void main(String[] args) {

		
		Person people[] = new Person[2];
		//fill the people arrary with Student and employee objects
		people[0] = new Employee("Harry",5000,1989,1,9);
		people[1] = new Student("marry","Trade");
		
		//print out names and descriptions of all Person objects
		
//		for (Person p : people) {
//			System.out.println(p.getName()+","+p.getDescription());
//		}
		
		System.out.println(people[1].getClass());

	}

}
