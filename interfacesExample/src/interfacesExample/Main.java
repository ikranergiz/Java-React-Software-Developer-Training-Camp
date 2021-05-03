package interfacesExample;

public class Main {

    public static void main(String[] args) {
        // write your code here
    //ICustomerDal iCustomerDal = new OracleCustomerDal();

    CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());

    //customermanager oracle ile çalışsın
    // kızdı constructordan sonra customerManager.customerDal = new OracleCustomerDal();
    //yukarıdaki olmasa da çalışır ama hatalı!!
    customerManager.add();


    }
}
/*bir class birden fazla interface i implement edebiliyor
*interfaceler de abstractlar gibi newlenemez
*
* arayüz kodları java fx ya da html
* managerlar
* veri erişim
*
* geçişler interfacelerle yapılır bağımlılıkları
* önlemek için
*
* hem extends hem implements olur
*
* interfaceler referans tutucu
* */