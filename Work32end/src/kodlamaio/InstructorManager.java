
package kodlamaio;

public class InstructorManager extends UserManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" "+"adlý eðitmen eklenmiþtir");
		System.out.println(instructor.getCoursesWith()+" "+"adlý kurs eklenmiþtir");
	}

}
