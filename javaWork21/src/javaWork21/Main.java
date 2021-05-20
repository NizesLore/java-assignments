package javaWork21;

public class Main {

	public static void main(String[] args) {
	
		Course course1=new Course(1,"Yazýlým Geliþtirici Yetiþtirme Kampý  C# + ANGULAR",
				"Engin Demiroð","Tamamlandý % 64");
		
		Course course2=new Course();
		course2.setId(2);
		course2.setName("Yazýlým Geliþtirici Yetiþtirme Kampý  JAVA + REACT");
		course2.setInstructorName("Engin Demiroð");
		course2.setDatails("Tamamlandý % 53");
		
		
		Instructor instructor1=new Instructor();
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroð");
		
		Course[] courses= {course1, course2};
		
		for(Course course: courses ) {
			System.out.println(course.getId()+ ".Kurs:"+course.getName() +".... " +course.getDetails());
							
			
		}
		CourseManager courseManager=new CourseManager();
		courseManager.add(course1);
		courseManager.delete(course1.getId());
		courseManager.addMultiple(courses);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(instructor1);
	
	
	
	
	}

}
