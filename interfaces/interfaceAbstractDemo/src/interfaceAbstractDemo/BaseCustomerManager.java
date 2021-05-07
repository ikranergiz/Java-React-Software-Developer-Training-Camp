package interfaceAbstractDemo;

public abstract class BaseCustomerManager implements ICustomerService{
    @Override
    public void save(Customer customer) {
        System.out.println ("Sved to db : " + customer.firstName);
    }

}
