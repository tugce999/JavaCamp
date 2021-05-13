package inheritance;

public class Main
{

	public static void main(String[] args) 
	{

      IndividualCustomer Engin = new IndividualCustomer();
      Engin.customerNumber ="12345";
      
      CorporateCustomer hepsiBurada = new CorporateCustomer();
      hepsiBurada.customerNumber="78910";
      
      SendikaCustomer ABC = new SendikaCustomer();
      ABC.customerNumber = "99999";
      
      CustomerManager customerManager = new CustomerManager();
     // customerManager.add(hepsiBurada);
     // customerManager.add(Engin);
     // customerManager.add(ABC);
      
      Customer[] customers= {Engin,ABC,hepsiBurada};
      customerManager.addMultiple(customers);
	}

}
