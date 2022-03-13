package interfaceAbstractDemoPractice.abstracts;


import java.rmi.RemoteException;

import interfaceAbstractDemoPractice.entities.Customer;

public interface ICustomerService {
    void Save(Customer customer) throws NumberFormatException, RemoteException;
}


