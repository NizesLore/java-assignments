package abstractClasses;

public abstract class GameCalculator {
	
	public abstract void hesapla() ;     //Kim inherit ediyorsa hesapla methodunu icermek zorunda,ayni zamanda override etmek zorunda yani kendi hesapla sýný yazmak zorunda..
	                                     //Amac: Bir veya birden fazla operasyonumuz var, onun icerisini base de belirlemek istemiyoruz ama bunu kim inherit ediyorsa 
	                                     //bu methodu yani hesapla yý inherit etmek zorunda yani kendi kodunu yazmak zorunda. 
	                                     //Bizim zorunlu kildigimiz tek þey bu hesaplý method u mutlaka olacak
	                                      //abstract lar base i gizlemek istedigimiz zamanlarda da kullanilir, abstract class lar new lenemez
	public final void gameOver() {                //final ekleyerek overriding edilmesi engellenir.GameCalculator class ý kullanildiginda 
		System.out.println("Oyun bitti");         //icerisindeki gameOver method unu oldugu gibi kullanmak zorunda,bu hic bir zaman degismeyecek
		                                          //bir kuraldýr
		
		
	}

}
