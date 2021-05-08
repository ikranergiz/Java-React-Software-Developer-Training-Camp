package InterfacesAbstractDemo.Abstracts;

import InterfacesAbstractDemo.Entities.Customer;

import java.rmi.RemoteException;

public interface CustomerCheckService {
    boolean CheckIfRealPerson(Customer customer) throws RemoteException;
}
