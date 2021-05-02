package inheritance;

public class CustomerManager {
	//customer (parametredeki)extend eden sýnýflarýn
	//referanslarýný tutabilir
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " kaydedildi");
	}
	//bulk insert
	public void addMultiple(Customer[] customers) {
		for(Customer customer : customers) {
			add(customer);
		}
		
	}
	

}
//SOLÝD -Open 
//sisteme yeni özellik eklendiðinde mevcut kod deðiþtiremezsin.Ekleyebilirsin.