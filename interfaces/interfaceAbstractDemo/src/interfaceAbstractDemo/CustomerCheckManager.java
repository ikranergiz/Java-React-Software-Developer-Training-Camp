package interfaceAbstractDemo;
//Starbuck a bağımlı değilim genel bir operasyon yapıyorum
public class CustomerCheckManager implements ICustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;
    }
}
