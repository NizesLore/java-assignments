package inheritanceDemo;

public class KrediUI {
	/*public void krediHesapla(OgretmenKrediManager ogretmenKrediManager) {
		ogretmenKrediManager.hesapla();
	}*/ 
	//Bu ifadenin yerine ogretmen,tarim,asker gibi cesitli  kredi turlerini  kapsayan Base(temel,ana) bir KrediManager tanimlariz

	public void krediHesapla(BaseKrediManager baseKrediManager) {
		baseKrediManager.hesapla();
		
	}
}
