package inheritance2;

public class DataBaseLogger extends Logger {
	//method override
	@Override //logger da var ezdim
	//kendi logger �m� yazaca��m
	public void log() {
		System.out.println("Database yolland�");
	}
}
