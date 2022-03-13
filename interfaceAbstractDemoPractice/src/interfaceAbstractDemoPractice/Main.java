package interfaceAbstractDemoPractice;

import java.rmi.RemoteException;

import interfaceAbstractDemoPractice.abstracts.BaseCustomerManager;

import interfaceAbstractDemoPractice.adapters.MernisServiceAdapter;
import interfaceAbstractDemoPractice.concretes.NeroCustomerManager;
import interfaceAbstractDemoPractice.concretes.StarbucksCustomerManager;
import interfaceAbstractDemoPractice.entities.Customer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());

		customerManager.Save(new Customer(1, "Ozan", "Polat", "2022", "123456789"));
	}

}
