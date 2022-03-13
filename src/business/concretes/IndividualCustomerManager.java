package business.concretes;

import business.abstracts.FullNameValidation;
import business.abstracts.IndividualCustomerService;
import dataAccess.abstracts.IndividualCustomerDao;
import entities.concretes.IndividualCustomer;

import java.util.List;

public class IndividualCustomerManager implements IndividualCustomerService {

    private IndividualCustomerDao customerDao;
    private FullNameValidation fullNameValidation;

    public IndividualCustomerManager(IndividualCustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public void add(IndividualCustomer customer) {

        fullNameValidation=new FullNameValidationManager();

        if(fullNameValidation.validate(customer.getFirstName(),customer.getLastName())){
            customerDao.add(customer);
        }
        else{
            System.out.println("ad soy ad 2 karakterden az olamaz!");
        }
    }

    @Override
    public void delete(IndividualCustomer customer) {
        customerDao.delete(customer);
    }

    @Override
    public List<IndividualCustomer> getAll() {
        return customerDao.getAll();
    }
}
