package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        Customer customer = new Customer("Alice Smith", "alice@example.com", 1001, PowerAgreementType.SPOTPRICE);


        System.out.println(customer.getName());
        System.out.println(customer.getEmail());
        System.out.println(customer.getCustomer_id());
        System.out.println(customer.getAgreement());

        System.out.println(customer);



        /*
        TODO

         Write code that creates a Customer object and teste the methods implemented in the class

        */
    }
}
