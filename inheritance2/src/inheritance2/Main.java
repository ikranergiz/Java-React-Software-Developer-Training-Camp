package inheritance2;

public class Main {

	public static void main(String[] args) {
		//yapt���m�z hareketler loglan�r. Kaydedilir
		//veritaban�nda falan
		//birbirinin alternatifi olan kodlar i�in
		//if yaz�lmaz??!!?!
		
		CustomerManager customerManager = new CustomerManager();
		
		customerManager.add(new DataBaseLogger());
	}

}
