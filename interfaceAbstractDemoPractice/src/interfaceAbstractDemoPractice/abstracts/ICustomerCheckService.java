package interfaceAbstractDemoPractice.abstracts;

import java.rmi.RemoteException;

import interfaceAbstractDemoPractice.entities.Customer;

public interface ICustomerCheckService {
	boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;
}
