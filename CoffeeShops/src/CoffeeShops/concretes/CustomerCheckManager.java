package CoffeeShops.concretes;

import CoffeeShops.abstracts.CustomerCheckService;
import CoffeeShops.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
	}

}

