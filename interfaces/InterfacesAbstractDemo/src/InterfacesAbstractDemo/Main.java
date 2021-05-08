package InterfacesAbstractDemo;

import InterfacesAbstractDemo.Abstracts.BaseCustomerManager;
import InterfacesAbstractDemo.Concretes.NeroCustomerManager;
import InterfacesAbstractDemo.Entities.Customer;



public class Main {

    public static void main(String[] args) {

        BaseCustomerManager baseCustomerManager = new NeroCustomerManager();
        baseCustomerManager.save(new Customer("Ikra","Nergiz","2001","15548360226"));

    }
}
