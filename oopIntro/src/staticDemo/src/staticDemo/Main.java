package staticDemo;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.price = 10;
        product.name = "Mouse";

        productManager.add(product);

        DatabaseHelper.Crud.Delete();
        //ÖNERİLMEZ!!
        //bir class tek bir iş yapmalı


    }
    //yardımcı araçlar kullan bırak
    //static yapılabilir
    //bir methodu static yaparsan class ismi ile çağırılır

}
