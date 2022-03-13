package business.abstracts;

import entities.concretes.Customer;
import entities.concretes.IndividualCustomer;

public interface FullNameValidation {
    boolean validate(String firstName,String lastName);
}
