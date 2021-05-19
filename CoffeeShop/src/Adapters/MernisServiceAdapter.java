package Adapters;

import java.rmi.RemoteException;
import java.time.ZoneId;

import Abstracts.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer){
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = true;
		try{client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
				customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
				customer.getDateOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear());
	}
		catch(RemoteException e )
		{
			e.printStackTrace();
		}
		return result;
		}

}
