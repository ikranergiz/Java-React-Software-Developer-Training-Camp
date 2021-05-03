package interfaceAbstractDemo;

public class Main {

    public static void main(String[] args) {

        BaseCustomerManager baseCustomerManager = new NeroCustomerManager();
        baseCustomerManager.save(new Customer());

    }
}
