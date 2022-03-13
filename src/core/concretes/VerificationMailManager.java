package core.concretes;

import core.abstracts.VerificationMailService;

public class VerificationMailManager implements VerificationMailService {
    @Override
    public boolean sendMail() {
        return true;
    }
}
