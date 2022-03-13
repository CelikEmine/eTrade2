package dataAccess.abstracts;

import entities.concretes.Customer;
import entities.concretes.IndividualCustomer;

import java.util.List;

public interface IndividualCustomerDao {
    void add(IndividualCustomer customer);
    void delete(IndividualCustomer customer);
    List<IndividualCustomer> getAll();
}
