package core.abstracts;

public interface EmailValidationService {

    boolean validateSyntax(String email);
    boolean validate(String email);

}
