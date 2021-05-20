package CoffeeShops;

import CoffeeShops.abstracts.BaseCustomerManager;
import CoffeeShops.adapters.MernisServiceAdapter;
import CoffeeShops.concretes.NeroCustomerManager;
import CoffeeShops.concretes.StarbucksCustomerManager;
import CoffeeShops.entities.Customer;

public class Main { 

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager=new NeroCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"NÝZES","LORE",1945,"12345678910"));
		
		System.out.println ("MERNÝS is adapted");
		
	}

}
