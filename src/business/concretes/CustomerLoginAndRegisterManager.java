package business.concretes;

import business.abstracts.CustomerLoginAndRegisterService;
import business.abstracts.IndividualCustomerService;
import business.abstracts.PasswordValidation;
import core.abstracts.VerificationMailService;
import core.abstracts.EmailValidationService;
import core.concretes.EmailValidationManagerAdaptor;
import core.concretes.VerificationMailManager;
import entities.concretes.IndividualCustomer;

public class CustomerLoginAndRegisterManager implements CustomerLoginAndRegisterService {

    IndividualCustomerService customerService;
    EmailValidationService emailValidationService=new EmailValidationManagerAdaptor();
    PasswordValidation passwordValidation=new PasswordValidationManager();
    VerificationMailService verificationMailService=new VerificationMailManager();


    public CustomerLoginAndRegisterManager(IndividualCustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void login(IndividualCustomer customer) {

        for(IndividualCustomer customerItem:customerService.getAll()){
            if(customer==customerItem){
                System.out.println("giriş başarılı");
            }
            else{
                System.out.println("böyle bir kullanıcı bulunamadı");
            }
        }
    }

    @Override
    public void register(String eMail, String password) {

        if(emailValidationService.validateSyntax(eMail) && passwordValidation.validate(password)){

            if(emailValidationService.validate(eMail)){

                System.out.println("aktifleştirmek için mail adresinizdeki linki onaylayın!");
                if(verificationMailService.sendMail()){
                    System.out.println("aktifleştirme başarılı");
                }
                else
                {
                    System.out.println("aktifleştirme başarısız lütfen gelen mail i onaylayın!");
                }

            }
            else{
                System.out.println("bu email adresi başkası tarafından kullanılmaktadır.");
            }
        }
        else {
            System.out.println("Kayıt olmak için mail ve passworda kurallara uyunuz!");
        }

    }


}
