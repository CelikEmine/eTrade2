package core.concretes;

import JGoogleAuthorization.GoogleAuthorizationServices;
import core.abstracts.VerificationMailService;
import core.abstracts.EmailValidationService;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidationManagerAdaptor implements EmailValidationService {

    @Override
    public boolean validateSyntax(String email) {

         Pattern validateEmailAddressRegex =
                Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

        Matcher matcher=validateEmailAddressRegex.matcher(email);
        return matcher.find();
    }

    @Override
    public boolean validate(String email) {
        GoogleAuthorizationServices authorizationServices=new GoogleAuthorizationServices();
        return authorizationServices.validate(email);
    }


    public static class VerificationMailManager implements VerificationMailService {

        @Override
        public boolean sendMail() {
            return true;
        }
    }
}
