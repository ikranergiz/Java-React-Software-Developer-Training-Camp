package interfaces;

public class Utils {
	//static
	public static void runLoggers(Logger[] loggers,String message) {
		
		//tekrar etmek istemiyorum
		for(Logger logger : loggers) {
			logger.log(message);
		}
	}

}
