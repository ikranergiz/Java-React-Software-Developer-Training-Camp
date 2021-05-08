package InterfacesAbstractDemo.Concretes;

import InterfacesAbstractDemo.Abstracts.CustomerCheckService;
import InterfacesAbstractDemo.Entities.Customer;
import MernisTest.src.tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


import java.rmi.RemoteException;


public class CustomerCheckManager implements CustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) throws RemoteException {

        KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();

        boolean result = kpsPublic.TCKimlikNoDogrula(
                Long.parseLong("15548360226"), "IKRA", "NERGİZ", 2001);

        System.out.println("Confirm : " + (result ? "SUCCESS" : "UNSUCCESS"));
        return true;
    }
}
