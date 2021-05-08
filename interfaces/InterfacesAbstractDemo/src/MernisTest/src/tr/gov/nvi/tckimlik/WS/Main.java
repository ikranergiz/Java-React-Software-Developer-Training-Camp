package MernisTest.src.tr.gov.nvi.tckimlik.WS;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException{
		// TODO Auto-generated method stub

		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		boolean result =  kpsPublic.TCKimlikNoDogrula(Long.parseLong("15548360226"),
				"IKRA",
				"NERG�Z", 
				2001);
		System.out.println("Confirm : " + (result ? "success" : "unsuccess"));
		
		
	}

}
