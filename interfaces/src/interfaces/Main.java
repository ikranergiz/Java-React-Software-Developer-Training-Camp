package interfaces;

public class Main {

	public static void main(String[] args) {
		//Logger da bir þey yok kii new Looger diyemezsin
		Logger[] loggers = {new SmsLogger() , new EmailLogger(),new FileLogger()};
		
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer engin = new Customer(1,"Engin","Demiroð");
		
		customerManager.add(engin);
		
	}

}
