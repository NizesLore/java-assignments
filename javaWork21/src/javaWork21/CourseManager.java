package javaWork21;

public class CourseManager {

	public void add (Course course) {
		System.out.println(course.getName() +     "  kayıt olundu");
		
	}
	public void delete (int id) {
		
		System.out.println("kursu silindi");
	}
	public void addMultiple(Course[] courses) {

          for(Course course: courses) {
	            System.out.println(course.getName() + "kayıt olundu.");
             }
		
	}
	
}
