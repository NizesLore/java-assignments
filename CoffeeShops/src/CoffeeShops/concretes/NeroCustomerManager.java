package CoffeeShops.concretes;

import CoffeeShops.abstracts.BaseCustomerManager;
import CoffeeShops.abstracts.CustomerCheckService;
import CoffeeShops.entities.Customer;


public class NeroCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService customerCheckService;
	
	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService=customerCheckService;
		
	}
	@Override
	public  void save(Customer customer  ) {
		
		if (this.customerCheckService.checkIfRealPerson(customer)) {
			
			super.save(customer);
			
		}else {
			System.out.println("Not a valid person");
		}
	}
	
	
}
