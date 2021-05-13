
public class Product {// constructure yapýcý blok
	
	public Product() {
		
		System.out.println(); 
	}
	
	public Product(int id, String name, double unitPrice, String detail) {
	
		this.id = id;
		this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;
        

	}
	int id ;
	String name;
	double unitPrice;
	String detail;

}
