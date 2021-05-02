package perfectNumberEx;

public class Main {

	public static void main(String[] args) {
		
		int number1 = 284;
		
		int number2 = 221;
		
		int total1= 0;
		
		int total2 = 0;
		
		for(int i = 1; i < number1; ++i) {
			
			if(0 == (number1 % i)) {
				total1 += i;
			}
		}
		
		for(int i = 1; i < number2; ++i) {
			
			if(0 == (number2 % i)) {
				total2 += i;
			}
		}
		
		
		if(number2 == total1 && number1 == total2) {
			System.out.println("Arkadaþ sayýlar");
		}
		
		else {
			System.out.println("Arkadaþ sayýlar deðil");
		}
		
		
	}

}
