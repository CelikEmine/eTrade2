package dataAccess.concretes;

import dataAccess.abstracts.IndividualCustomerDao;
import entities.concretes.Customer;
import entities.concretes.IndividualCustomer;

import java.util.List;

public class HibernateIndividualCustomerDao implements IndividualCustomerDao {
    @Override
    public void add(IndividualCustomer customer) {
        System.out.println(customer.getCustomerNumber()+" numaralı müşteri eklendi.");
    }

    @Override
    public void delete(IndividualCustomer customer) {
        System.out.println(customer.getCustomerNumber()+" numaralı müşteri silindi.");
    }

    @Override
    public List<IndividualCustomer> getAll() {
        return null;
    }
}
