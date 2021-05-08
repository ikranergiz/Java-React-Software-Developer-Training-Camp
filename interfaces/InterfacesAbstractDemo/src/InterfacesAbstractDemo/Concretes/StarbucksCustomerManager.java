package InterfacesAbstractDemo.Concretes;

import InterfacesAbstractDemo.Abstracts.BaseCustomerManager;
import InterfacesAbstractDemo.Abstracts.CustomerCheckService;
import InterfacesAbstractDemo.Abstracts.CustomerService;
import InterfacesAbstractDemo.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

    private CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }


    @Override
    public void save(Customer customer){
        if(customerCheckService.CheckIfRealPerson(customer)){
            save(customer);
        }
        else{
            System.out.println("not a real person");
        }

    }
}
