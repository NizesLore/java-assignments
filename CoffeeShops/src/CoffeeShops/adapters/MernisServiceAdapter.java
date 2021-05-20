package CoffeeShops.adapters;

import java.rmi.RemoteException;
import java.util.Locale;

import CoffeeShops.abstracts.CustomerCheckService;
import CoffeeShops.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer)  {
		
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		
		boolean result=true; 
		try {
			result=client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalIdentity()), 
					customer.getFirstName().toUpperCase(new Locale("tr")),
					customer.getLastName().toUpperCase(new Locale("tr")),
					customer.getTimeOfBirth());
		
		} catch (RemoteException e) {
			result =false;
			e.printStackTrace();
		}
		
		
		return result;
	}

}
