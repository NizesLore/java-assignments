
public class methods2 {

	public static void main(String[] args) {
		
		
		String message="Bugün hava çok güzel.";
		
		//message.substring(0,2);   Bu method bir sey donduruyor return ediyor,
		//yani newMessage artik substring in olusturdugu sonuc
		
		//String newMessage=message.substring(0,2);
		
		String newMessage=writeCity();
		System.out.println(newMessage);
	    int sayi= topla(0,8);	
	    System.out.println(sayi);
	    
	    int toplam=topla2(2,3,4,5,6,7,8);
	    System.out.println(toplam);
	    
	    
		}
		
		public static void add() {
			System.out.println("Eklendi");
	    }
  
		public static void delete() {
			System.out.println("Silindi");
		}
		public static void update() {
			System.out.println("Güncellendi");
		}
		public static int topla(int sayi1,int sayi2) {
			return sayi1+sayi2;                    // return : bitir ve 5 dondur
			
		}
		
		//  *************  V26    VARIABLE ARGUMENTS       ************************
		
		public static int topla2(int... sayilar) {
			int toplam=0;
			for (int sayi: sayilar) {
				toplam+=sayi;           // --> toplam = toplam + sayi;
			
			}
			return toplam;
						
		}
		
		public static String writeCity() {
			return "Artvin";
			
		}
		
		
}
