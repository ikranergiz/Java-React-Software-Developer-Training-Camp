package interfaceAbstractDemo;

public class Main {

    public static void main(String[] args) {

        BaseCustomerManager baseCustomerManager = new NeroCustomerManager();
        Customer customer = new Customer();
        customer.firstName = "ıkra";
        baseCustomerManager.save(customer);
    }
}
