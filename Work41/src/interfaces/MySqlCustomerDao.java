package interfaces;

public class MySqlCustomerDao implements CustomerDao{

	@Override
	public void add() {
		System.out.println("My Sql eklendi");
		
	}

}
