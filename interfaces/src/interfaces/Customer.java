package interfaces;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	
	public Customer() {
		
		
	}

	public Customer(int id, String firstName, String lastName) {
		//super();//inherit eden s�n�f varsa o s�n�f�n parametresiz konst �a��r
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

}
