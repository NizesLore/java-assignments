package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) {
		return tutar*1.18;
		
	}
// overridable -->  uzerine yazilabilir..public final double hesapla(){} gibi final keyword u ile method u 
// isaretlersen onu kimse ezemez
}
