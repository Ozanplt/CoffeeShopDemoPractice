package interfaceAbstractDemoPractice.concretes;


import interfaceAbstractDemoPractice.abstracts.ICustomerCheckService;

import interfaceAbstractDemoPractice.entities.Customer;
public class CustomerCheckManager implements ICustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return true;
    }
}
