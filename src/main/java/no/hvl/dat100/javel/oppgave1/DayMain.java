package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE a");
        System.out.println("==============");
        DailyPower.printPowerPrices(powerprices_day);
        System.out.println();

        System.out.println("==============");
        System.out.println("OPPGAVE b");
        System.out.println("==============");
        DailyPower.printPowerUsage(powerusage_day);
        System.out.println();

        System.out.println("==============");
        System.out.println("OPPGAVE c");
        System.out.println("==============");
        System.out.println("Totalt forbruk for hele dagen: " + DailyPower.computePowerUsage(powerusage_day) + " kWh");

        System.out.println("==============");
        System.out.println("OPPGAVE d");
        System.out.println("==============");
        System.out.printf("Total strømpris for hele dagen: %.2f NOK", DailyPower.computeSpotPrice(powerusage_day, powerprices_day));
        System.out.println();

        System.out.println("==============");
        System.out.println("OPPGAVE e");
        System.out.println("==============");
        System.out.printf("Strømstøtten blir: %.2f NOK",DailyPower.getSupport(powerusage_day[8],powerprices_day[8]));
        System.out.println();

        System.out.println("==============");
        System.out.println("OPPGAVE f");
        System.out.println("==============");
        System.out.printf("Strømstøtten for hele dagen blir: %.2f NOk",DailyPower.computePowerSupport(DayPowerData.powerusage_day, DayPowerData.powerprices_day));
        System.out.println();

        System.out.println("==============");
        System.out.println("OPPGAVE g");
        System.out.println("==============");
        System.out.printf("Med norgespris blir denne dagen: %.2f NOK", DailyPower.computeNorgesPrice(DayPowerData.powerusage_day));
        System.out.println();

        System.out.println("==============");
        System.out.println("OPPGAVE h");
        System.out.println("==============");
        System.out.println(DailyPower.findPeakUsage(DayPowerData.powerusage_day) + "kWh er det største forburket kunden har hatt i løpet av en time idag");

        System.out.println("==============");
        System.out.println("OPPGAVE i");
        System.out.println("==============");
        System.out.printf("Gjennomsnittlig strømbruk er: %.2fkWh", DailyPower.findAvgPower(DayPowerData.powerusage_day));
        System.out.println();
        /*
        TODO

         Write code that tests the methods you implement in the DailyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */

    }
}
