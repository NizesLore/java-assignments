package javaWork21;

public class Main {

	public static void main(String[] args) {
	
		Course course1=new Course(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp�  C# + ANGULAR",
				"Engin Demiro�","Tamamland� % 64");
		
		Course course2=new Course();
		course2.setId(2);
		course2.setName("Yaz�l�m Geli�tirici Yeti�tirme Kamp�  JAVA + REACT");
		course2.setInstructorName("Engin Demiro�");
		course2.setDatails("Tamamland� % 53");
		
		
		Instructor instructor1=new Instructor();
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiro�");
		
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
