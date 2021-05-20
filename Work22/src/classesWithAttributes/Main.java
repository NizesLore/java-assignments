package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product=new Product(1,"Laptop","Acer Laptop",5000,3,"Siyah");
		
		/*product.setId(1);
		product.setName("Laptop");
		product.setDescription("Acer Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);*/
	
		
		ProductManager productManager=new ProductManager();
		productManager.add(product);
		 
		System.out.println(product.getCode());
		
		
		//*********** METHOD OVERLOADING ************* METHOD OVERLOADING
		
		DortIslem dortIslem=new  DortIslem();
		System.out.println(dortIslem.topla(2,3));
		System.out.println(dortIslem.topla(2,2,3,7));
		
		
		
		
		}
	 

}
