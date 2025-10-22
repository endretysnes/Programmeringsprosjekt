package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave2.MonthlyPower;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

import java.util.Arrays;

public class Invoice {

    private Customer c; // customer associated with this invoice
    private String month; // month that the invoice covers
    private double[][] usage; // power usage this month (per day and per hour)
    private double[][] prices; // power prices for this month

    private double amount; // power price for this month


    public Invoice(Customer c, String month, double[][] usage, double[][] power_prices) {

        this.c = c;
        this.month = month;
        this.usage = usage;
        this.prices = power_prices;
        amount = 0;
    }

    public void computeAmount() {
        amount = 0;

        PowerAgreementType avtale = c.getAgreement();

        if(avtale == PowerAgreementType.SPOTPRICE){

            amount = MonthlyPower.computeSpotPrice(usage, prices);
            System.out.printf("Spotpris for %s %.2f NOK\n",month, amount);
        }
        if(avtale == PowerAgreementType.NORGESPRICE){
            amount = MonthlyPower.computeNorgesPrice(usage);
            System.out.printf("Norgespris for %s %.2f NOK\n", month, amount);
        }
        if(avtale == PowerAgreementType.POWERSUPPORT){
            double support = MonthlyPower.computePowerSupport(usage, prices);
            amount = MonthlyPower.computeSpotPrice(usage, prices);
            amount = amount - support;
            System.out.printf("Powersupport for %s %.2f NOK\n", month, amount);
        }

    }

    public void printInvoice() {
        System.out.println("========================");
        System.out.println("Customer number: " + c.getCustomer_id());
        System.out.println("Name: " + c.getName());
        System.out.println("Email: " + c.getEmail());
        System.out.println("Agreement: " + c.getAgreement());
        System.out.println();
        System.out.println("Month: " + month);
        System.out.printf("Usage: %.2f kWh\n", MonthlyPower.computePowerUsage(usage));
        System.out.printf("Amount: %.2f NOk\n", amount);
        System.out.println("========================");
    }
}
