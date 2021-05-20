package kodlamaio;

public class Student extends User {
	private String address;
	private String myCourses;
	
	public Student() {
		
	}

	public Student(String address, String myCourses) {
		super();
		this.address = address;
		this.myCourses = myCourses;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMyCourses() {
		return myCourses;
	}

	public void setMyCourses(String myCourses) {
		this.myCourses = myCourses;
	}
	

}
