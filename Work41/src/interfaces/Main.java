package interfaces;

public class Main {

	public static void main(String[] args) {
		// CustomerDao customerDao=new CustomerDao() ; interface ler NEW LENEMEZ
		//CustomerDao customerDao=new OracleCustomerDao(); // interface, onu implemente eden class in reference ini tutabilir..polymorphism
		
		CustomerManager customerManager=new CustomerManager(new MySqlCustomerDao());
		                                                    ;   //customerManager daki ekle,sil,guncelle hepsi Oracle ile  calisacak
		customerManager.add();                                 //yani veri tabani olarak Oracle i sectik
		
		
		
		

	}

}
