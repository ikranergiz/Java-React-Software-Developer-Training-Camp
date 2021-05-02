package interfaces;


public class CustomerManager {
	
	private Logger[] loggers;
	
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	
	public void add(Customer customer) {
		System.out.println("müþteri eklendi " + customer.getFirstName());
		
		//sýklýkla kullanacaðýz statik yap
		//Utils utils = new Utils();
		//sýnýfýn func çaðýrdýk
		Utils.runLoggers(loggers, customer.getFirstName());
		
	}
	

	public void delete(Customer customer) {
		System.out.println("müþteri silindi " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
		
		
	}
}
