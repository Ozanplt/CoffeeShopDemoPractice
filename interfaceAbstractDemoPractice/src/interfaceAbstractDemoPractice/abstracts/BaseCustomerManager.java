package interfaceAbstractDemoPractice.abstracts;


import java.rmi.RemoteException;

import interfaceAbstractDemoPractice.entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{
    public void Save(Customer customer) throws NumberFormatException, RemoteException {
        System.out.println("Saved to Database: "+ customer.getFirstName());
    }
}
