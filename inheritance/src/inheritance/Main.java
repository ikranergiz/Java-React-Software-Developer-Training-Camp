package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber = "12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78910";
		//sistemin izin verdiði þeylerde patlarsýnýz!!!
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "213";
		
		CustomerManager customerManager = new CustomerManager();
		
		
		/*customerManager.add(hepsiBurada);
		customerManager.add(engin);
		customerManager.add(abc);*/
		
		Customer[] customers = {engin,abc,hepsiBurada};
		
		customerManager.addMultiple(customers);
		
	}

}
