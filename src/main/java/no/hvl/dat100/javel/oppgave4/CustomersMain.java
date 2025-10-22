package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        Customers customers = new Customers(5);
        Customer p1 = new Customer("Alice Smith", "alice@example.com", 1002, PowerAgreementType.SPOTPRICE);
        Customer p2 = new Customer("Bob Johnson", "bob@example.com", 1003, PowerAgreementType.NORGESPRICE);
        Customer p3 = new Customer("Charlie Rose", "charlie@example.com", 1004, PowerAgreementType.POWERSUPPORT);
        Customer p4 = new Customer("Diana Prince", "diana@example.com", 1005, PowerAgreementType.NORGESPRICE);
        Customer p5 = new Customer("Ethan Hunt", "ethan@example.com", 1006, PowerAgreementType.POWERSUPPORT);

        customers.addCustomer(p1);
        customers.addCustomer(p2);
        customers.addCustomer(p3);
        customers.addCustomer(p4);
        customers.addCustomer(p5);

        System.out.println("Antall kunder: " + customers.countNonNull());

        System.out.println("Kunden er hentet: " + customers.getCustomer(1002));

        System.out.println("Kunden er fjernet: " + customers.removeCustomer(1003));
        System.out.println("Antall kunder: " + customers.countNonNull());

        Customer[] nyKundeTabell = customers.getCustomers();
        for(int i = 0; i < nyKundeTabell.length; i++){
            System.out.println(nyKundeTabell[i]);
        }
        /*
        TODO

         Write code that uses and tests the methods implemented in the Customers class

        */

    }
}
