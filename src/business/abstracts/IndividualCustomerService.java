package business.abstracts;

import entities.concretes.IndividualCustomer;

import java.util.List;

public interface IndividualCustomerService {
    public void add(IndividualCustomer customer);
    public void delete(IndividualCustomer customer);
    public List<IndividualCustomer> getAll();
}
