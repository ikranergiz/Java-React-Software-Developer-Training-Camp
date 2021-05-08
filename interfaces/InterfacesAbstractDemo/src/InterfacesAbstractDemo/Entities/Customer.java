package InterfacesAbstractDemo.Entities;

import InterfacesAbstractDemo.Abstracts.Entities;

public class Customer implements Entities {


    public int id;
    public String firstName;
    public String lastName;
    public String dateTime;
    public String nationalityId;

    public Customer(String firstName,String lastName,String dateTime,String nationalityId){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateTime = dateTime;
        this.nationalityId = nationalityId;
    }

}
