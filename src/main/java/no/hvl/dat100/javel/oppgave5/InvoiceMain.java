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

        Invoice invoice1 = new Invoice(p1, "Januar", CustomerPowerUsageData.usage_month_customer1, MonthPowerData.powerprices_month);
        Invoice invoice2 = new Invoice(p2, "Mars", CustomerPowerUsageData.usage_month_customer2, MonthPowerData.powerprices_month);
        Invoice invoice3 = new Invoice(p3, "August", CustomerPowerUsageData.usage_month_customer3, MonthPowerData.powerprices_month);

        invoice1.computeAmount();
        invoice2.computeAmount();
        invoice3.computeAmount();


        invoice1.printInvoice();
        invoice2.printInvoice();
        invoice3.printInvoice();

        System.out.println("     ^      ");
        System.out.println("     |       ");
        System.out.println("Uten Invoices");
        System.out.println("Med Invoices");
        System.out.println("     |       ");
        System.out.println("     V       ");

        Invoice[] invoiceArray = {invoice1, invoice2, invoice3};

        Invoices.processInvoices(invoiceArray);

        /*
        TODO

         Write code that uses the methods implemented in the Invoice-classes

        */

    }
}
