package oopIntro;

public class Product {

	//encapsulation
	//final ifadesi elemanlarýn dýþarýdan eriþimini engeller
	//sadece constructorda set edilebilir.
	private int id;
	private String name;
	private double unitPrice;
	private String detail;
	private double discount;
	
	public Product() {
		
		
	}
	public Product(int id, String name,double price, String detail,
			double discount,double unitPriceAfterDiscount) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = price;
		this.detail = detail;
		this.discount = discount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double price) {
		this.unitPrice = price;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getUnitPriceAfterDiscount() {
		return this.unitPrice - (this.unitPrice * this.discount / 100);
	}
	
	
	
	
	
	
	
	
}
