package interfaceAbstractDemoPractice.adapters;

import java.rmi.RemoteException;

import interfaceAbstractDemoPractice.abstracts.ICustomerCheckService;
import interfaceAbstractDemoPractice.entities.Customer;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {
	@Override
	public boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean checkResult = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
				customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
				Integer.parseInt(customer.getDateOfBirth()));
		
		if(checkResult) {
			return true;
		}
		else {
			return false;
		}

	}
}
