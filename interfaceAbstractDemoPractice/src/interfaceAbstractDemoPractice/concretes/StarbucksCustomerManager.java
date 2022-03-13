package interfaceAbstractDemoPractice.concretes;

import java.rmi.RemoteException;

import interfaceAbstractDemoPractice.abstracts.BaseCustomerManager;
import interfaceAbstractDemoPractice.abstracts.ICustomerCheckService;

import interfaceAbstractDemoPractice.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	private ICustomerCheckService _customerCheckService;

	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this._customerCheckService = customerCheckService;
	}

	@Override
    public void Save(Customer customer) throws NumberFormatException, RemoteException {
        	if(_customerCheckService.CheckIfRealPerson(customer)){
          	super.Save(customer);
        	}
            else{
            	System.out.println("Not a valid person");
            }
        }

}
