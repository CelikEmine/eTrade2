package business.abstracts;

import entities.concretes.IndividualCustomer;

public interface CustomerLoginAndRegisterService {

    void login(IndividualCustomer customer);
    void register(String eMail,String password);

}
