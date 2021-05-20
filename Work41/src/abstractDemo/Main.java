package abstractDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager=new CustomerManager();  //new ledikten sonra hemen "customerManager.getCustomers();"
		                                                         // yazamayiz.databaseManager abstract oldugundan dogrudan cagiramayiz
		                                                         //hangi database kullandigimizi yazmamiz gerek
		customerManager.databaseManager=new OracleDatabaseManager();
		customerManager.databaseManager=new SqlServerDatabaseManager();
		customerManager.databaseManager=new MySqlDatabaseManager();
		customerManager.getCustomers();
		

	}
	

}
