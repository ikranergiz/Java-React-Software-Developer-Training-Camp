package inheritance2;

public class LogManager {
	public void log(int logType) {
		//hepsi logluyor,birbirinin alternatifi 
		//yazma
		if(1 == logType) {
			System.out.println("Veri tabanýna loglandý");
		}
		else if(2 == logType) {
			System.out.println("Dosyaya loglandý");
		}
		else {
			System.out.println("E-mail gönderildi");
		}
		//deðiþim içinde kavga ediyoruz
		//clean kod deðil
		
	}
		
	
}


//database 
//file
//e-mail
//log?