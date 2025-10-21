package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DayPowerData;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2a - Strømforbruk hver dag");
        System.out.println("==============");
        MonthlyPower.print_PowerUsage(power_usage_month);

        System.out.println();
        System.out.println("==============");
        System.out.println("OPPGAVE 2b - Strømpris per dag");
        System.out.println("==============");
        MonthlyPower.print_PowerPrices(power_prices_month);

        System.out.println();
        System.out.println("==============");
        System.out.println("OPPGAVE 2c");
        System.out.println("==============");
        System.out.printf("Total måndedlig forbruk: %.2f kWh", MonthlyPower.computePowerUsage(power_usage_month));

        System.out.println();
        System.out.println("==============");
        System.out.println("OPPGAVE 2d");
        System.out.println("==============");
        System.out.println(MonthlyPower.exceedThreshold(power_usage_month, 5000));


        System.out.println();
        System.out.println("==============");
        System.out.println("OPPGAVE 2e - Spotpris");
        System.out.println("==============");
        System.out.printf("Totalt prisen for måneden %.2f NOK",MonthlyPower.computeSpotPrice(power_usage_month, power_prices_month));

        System.out.println();
        System.out.println("==============");
        System.out.println("OPPGAVE 2f");
        System.out.println("==============");
        System.out.println(MonthlyPower.computePowerSupport(power_usage_month, power_prices_month));
        /*
        TODO

         Write code that tests the methods you implement in the MonthlyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */

    }
}