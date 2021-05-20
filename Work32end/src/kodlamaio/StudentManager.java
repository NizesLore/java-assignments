package kodlamaio;

public class StudentManager extends UserManager{
	public void register(User user) {
		System.out.println(user.getFirstName()+" :"+user.getLastName()+" :"+"kaydýnýz alýnmýþtýr");
		
	}

}
