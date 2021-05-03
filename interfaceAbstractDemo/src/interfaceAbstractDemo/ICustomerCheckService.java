package interfaceAbstractDemo;

//starbuck için checkIfRealPerson func yazabilirdik
//ama nero firması da isterse ileride böyle bir doğrulama
//bunu interfacede yapmak daha doğru olur :)

public interface ICustomerCheckService {
    boolean ICustomerCheckService(Customer customer);
}
