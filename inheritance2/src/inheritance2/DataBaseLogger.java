package inheritance2;

public class DataBaseLogger extends Logger {
	//method override
	@Override //logger da var ezdim
	//kendi logger ýmý yazacaðým
	public void log() {
		System.out.println("Database yollandý");
	}
}
