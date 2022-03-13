package business.concretes;

import business.abstracts.FullNameValidation;
import entities.concretes.IndividualCustomer;

public class FullNameValidationManager implements FullNameValidation {
    @Override
    public boolean validate(String firstName,String lastName) {

        if(firstName.length()<2  || lastName.length()<2){
            return false;
        }
        return true;
    }
}
