
package kodlamaio;

public class InstructorManager extends UserManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" "+"adl� e�itmen eklenmi�tir");
		System.out.println(instructor.getCoursesWith()+" "+"adl� kurs eklenmi�tir");
	}

}
