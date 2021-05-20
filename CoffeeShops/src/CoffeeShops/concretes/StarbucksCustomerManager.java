package CoffeeShops.concretes;

import CoffeeShops.abstracts.BaseCustomerManager;
import CoffeeShops.abstracts.CustomerCheckService;
import CoffeeShops.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();		
		this.customerCheckService=customerCheckService;
		
	}
		
	@Override
	public  void save(Customer customer){
		
		if (this.customerCheckService.checkIfRealPerson(customer)) {
			
			super.save(customer);
			
		}else {
			System.out.println("Not a valid person");
		}
		
					
	
		
		
	}
}
