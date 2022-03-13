package business.concretes;

import business.abstracts.PasswordValidation;

public class PasswordValidationManager implements PasswordValidation {
    @Override
    public boolean validate(String password) {
        if(password.length()<6){
            return false;
        }
        return true;
    }
}
