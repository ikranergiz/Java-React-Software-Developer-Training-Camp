package inheritance2;

public class CustomerManager {
	//logger o referanslar� tutabilir.
	public void add(Logger logger) {
		//m��teri ekleme kodlar�
		System.out.println("M��teri eklendi");
		//hay�rs�z ! DataBaseLogger logger = new DataBaseLogger();
		logger.log();
	}
}


//i� yapan class ba�ka bir s�n�f� kullanacaksa
//i�inde new olmazzz!!
