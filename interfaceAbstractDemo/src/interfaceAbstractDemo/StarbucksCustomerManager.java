package interfaceAbstractDemo;

public class StarbucksCustomerManager extends BaseCustomerManager {//implements ICustomerService{

    //dependence injection
    private ICustomerCheckService iCustomerCheckService;
    public StarbucksCustomerManager(ICustomerCheckService iCustomerCheckService){
        this.iCustomerCheckService = iCustomerCheckService;
    }
    @Override
    public void save(Customer customer){
        if(iCustomerCheckService.ICustomerCheckService(customer)) {

            super.save(customer);
        }
        else{
            System.out.println("Kimlik doğrulanamadı");
        }
    }
}
