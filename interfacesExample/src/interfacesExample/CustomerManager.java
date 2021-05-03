package interfacesExample;

public class CustomerManager {
    private ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }

    public void add(){

        customerDal.add();
        //iş kodları yazılır veri doğru mu falan
        //OracleCustomerDal oracleCustomerDal = new OracleCustomerDal();
        //geçmiş olsun bağımlısın !

    }
}
