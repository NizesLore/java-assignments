package abstractDemo;

public class CustomerManager {
	
	BaseDatabaseManager databaseManager;  //Buraya dogrudan oracle,sql gibi database ismini yazamayiz..O zaman veritababnina bagli kalinmis olur..
	                                      // Farkli veri tabanlarinin tumunu temsil eden,iceren bir yapi olan Base i yazariz ki istedigimiz zamnan 
	                                      //istedigimiz veri tabani ile calisabilelim :)
	
	public void getCustomers() {
		databaseManager.getData();
	}

}
