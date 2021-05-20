package kodlamaio;

public class Main {

	public static void main(String[] args) {
		
		Student student=new Student();
		student.setId(1);
		student.setFirstName("Nizes");
		student.setLastName("Lore");
		student.setEmail("oopjava@gmail.com");
		student.setPassword("Spring boot");
		student.setMyCourses("Java");
		
		StudentManager studentManager=new StudentManager();
		studentManager.update(student);
		
		Instructor instructor=new Instructor(1,"Engin","Demiroð","kodlamaio@gmail.com","abcde",
				"Yazýlým Geliþtirici Yetiþtirme Kampý JAVA+REACT");
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(instructor);
		
				
		
		
		
		
		

	}

}
