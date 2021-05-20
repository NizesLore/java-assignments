package interfaces;

public class CustomerManager {
	
	private CustomerDao customerDao;
	public CustomerManager(CustomerDao customerDao) {
		this.customerDao=customerDao;
		
	}
	
		public void add() {
		//is kodlari
			customerDao.add();             //CustomerManager in CustomerDao su var ve biz onun add ini cagiriyoruz
			
		
	}

}
