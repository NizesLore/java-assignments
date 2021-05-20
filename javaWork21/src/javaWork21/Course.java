package javaWork21;

public class Course {
	 private int id;
	 private String name;
	 private  String instructorName;
	 private String details;
	 
	public Course() {
		super();
	}

	public Course(int id, String name, String instructorName, String details) {
		super();
		this.id = id;
		this.name = name;
		this.instructorName = instructorName;
		this.details = details;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public String getDetails() {
		return details;
	}

	public void setDatails(String details) {
		this.details = details;
	}
	 
	 

}
