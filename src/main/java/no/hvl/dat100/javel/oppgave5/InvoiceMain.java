package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();

        Customer p1 = new Customer("Alice Smith", "alice@example.com", 1002, PowerAgreementType.SPOTPRICE);
        Customer p2 = new Customer("Bob Johnson", "bob@example.com", 1003, PowerAgreementType.NORGESPRICE);
        Customer p3 = new Customer("Charlie Rose", "charlie@example.com", 1004, PowerAgreementType.POWERSUPPORT);
        Customer p4 = new Customer("Diana Prince", "diana@example.com", 1005, PowerAgreementType.NORGESPRICE);
        Customer p5 = new Customer("Ethan Hunt", "ethan@example.com", 1006, PowerAgreementType.POWERSUPPORT);

        Invoice invoice = new Invoice(p1, "Januar", CustomerPowerUsageData.usage_month_customer1, CustomerPowerUsageData.);
        /*
        TODO

         Write code that uses the methods implemented in the Invoice-classes

        */

    }
}
