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
            for(int i = 0; i < usage.length; i ++){
                for(int j = 0; j < usage[i].length; j++){
                    amount += usage[i][j] * prices[i][j];
                }
            }
            System.out.println(amount);
        }
        if(avtale == PowerAgreementType.NORGESPRICE){
            for(int i = 0; i < usage.length; i++){
                for(int j = 0; j < usage[i].length; j++){
                    amount += usage[i][j] * 0.5;
                }
            }
            System.out.println(amount);
        }
        if(avtale == PowerAgreementType.POWERSUPPORT){
            for(int i = 0; i < usage.length; i++){
                for(int j = 0; j < usage[i].length; j++){
                    amount += usage[i][j] * prices[i][j];
                }
            }
            amount = amount * 0.9;
            System.out.println(amount);
        }

    }

    public void printInvoice() {

        // TODO

    }
}
