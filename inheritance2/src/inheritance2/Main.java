package inheritance2;

public class Main {

	public static void main(String[] args) {
		//yaptýðýmýz hareketler loglanýr. Kaydedilir
		//veritabanýnda falan
		//birbirinin alternatifi olan kodlar için
		//if yazýlmaz??!!?!
		
		CustomerManager customerManager = new CustomerManager();
		
		customerManager.add(new DataBaseLogger());
	}

}
