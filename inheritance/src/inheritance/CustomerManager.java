package inheritance;

public class CustomerManager {
	//customer (parametredeki)extend eden s�n�flar�n
	//referanslar�n� tutabilir
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
//SOL�D -Open 
//sisteme yeni �zellik eklendi�inde mevcut kod de�i�tiremezsin.Ekleyebilirsin.