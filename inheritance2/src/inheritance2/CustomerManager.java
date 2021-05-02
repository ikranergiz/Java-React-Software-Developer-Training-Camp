package inheritance2;

public class CustomerManager {
	//logger o referanslarý tutabilir.
	public void add(Logger logger) {
		//müþteri ekleme kodlarý
		System.out.println("Müþteri eklendi");
		//hayýrsýz ! DataBaseLogger logger = new DataBaseLogger();
		logger.log();
	}
}


//iþ yapan class baþka bir sýnýfý kullanacaksa
//içinde new olmazzz!!
