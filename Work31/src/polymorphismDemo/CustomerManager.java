package polymorphismDemo;

public class CustomerManager {
	
	private BaseLogger baseLogger;    //Burada bagimliligi azaltmak icin private bir field(attribute)
	                                  //alan olusturuyoruz..Bu class her new lendiginde calisacak bir yapi olan constructor 
	                                   //olusturuyoruz..Icine de bu class ile birlikte calismasini istedigimiz ba�ka bir class � injection ediyoruz...
	
	public CustomerManager(BaseLogger baseLogger) {
		this.baseLogger=baseLogger;
			
	}
	
	
	public void add() {
		System.out.println("M��teri eklendi");
		this.baseLogger.log("Log mesaj� :)))");
	}

}
