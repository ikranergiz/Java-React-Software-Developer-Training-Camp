package inheritance2;

public class LogManager {
	public void log(int logType) {
		//hepsi logluyor,birbirinin alternatifi 
		//yazma
		if(1 == logType) {
			System.out.println("Veri taban�na logland�");
		}
		else if(2 == logType) {
			System.out.println("Dosyaya logland�");
		}
		else {
			System.out.println("E-mail g�nderildi");
		}
		//de�i�im i�inde kavga ediyoruz
		//clean kod de�il
		
	}
		
	
}


//database 
//file
//e-mail
//log?