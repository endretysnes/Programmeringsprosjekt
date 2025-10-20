package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        Customers customer1 = new Customers(4);
        Customer p1 = new Customer("Bob Johnson", "bob@example.com", 1002, PowerAgreementType.NORGESPRICE);

        System.out.println(customer1.countNonNull());

        System.out.println(customer1.getCustomer(1002));
        /*
        TODO

         Write code that uses and tests the methods implemented in the Customers class

        */

    }
}
