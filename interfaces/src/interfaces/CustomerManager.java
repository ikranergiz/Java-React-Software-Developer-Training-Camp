package interfaces;


public class CustomerManager {
	
	private Logger[] loggers;
	
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	
	public void add(Customer customer) {
		System.out.println("m��teri eklendi " + customer.getFirstName());
		
		//s�kl�kla kullanaca��z statik yap
		//Utils utils = new Utils();
		//s�n�f�n func �a��rd�k
		Utils.runLoggers(loggers, customer.getFirstName());
		
	}
	

	public void delete(Customer customer) {
		System.out.println("m��teri silindi " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
		
		
	}
}
