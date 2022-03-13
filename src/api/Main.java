package api;

import business.abstracts.IndividualCustomerService;
import business.concretes.CustomerLoginAndRegisterManager;
import business.concretes.IndividualCustomerManager;
import dataAccess.concretes.HibernateIndividualCustomerDao;
import entities.concretes.IndividualCustomer;

public class Main {

    public static void main(String[] args) {

        IndividualCustomer customer=new IndividualCustomer(1,"12345","hatice","blasl","htc@gmail.com","abc123");

        IndividualCustomerService individualCustomerService=new IndividualCustomerManager(new HibernateIndividualCustomerDao());
        individualCustomerService.add(customer);

        CustomerLoginAndRegisterManager customerLoginAndRegisterManager=new CustomerLoginAndRegisterManager(individualCustomerService);

        customerLoginAndRegisterManager.register("ttzz@gmail.com","12312121456");



    }
}
