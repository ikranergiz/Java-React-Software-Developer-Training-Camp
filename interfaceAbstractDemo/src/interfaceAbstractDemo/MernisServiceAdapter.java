package interfaceAbstractDemo;

public class MernisServiceAdapter implements ICustomerCheckService{
    @Override
    public boolean ICustomerCheckService(Customer customer) {

        KPSPublicSoapClient kpsPublicSoapClient = new KPSPublicSoapClient();
        kpsPublicSoapClient.TCKimlikDogrula(customer);
        return false;
    }
}
