package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower{


    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {
        for (int dag = 0; dag < usage.length; dag++) {
            System.out.println("Dag " + (dag + 1) + ": ");
            DailyPower.printPowerUsage(usage[dag]);
            System.out.println();
        }
    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {
        for (int dag = 0; dag < prices.length; dag++) {
            System.out.println("Dag " + (dag + 1) + ": ");
            DailyPower.printPowerPrices(prices[dag]);
            System.out.println();
        }
    }


    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;

        for(int i = 0; i < usage.length; i++){
            for(int j = 0; j < usage[i].length; j++){
                sum += usage[i][j];
            }
        }

        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;
        int i = 0;


        while(i < powerusage.length && !exceeded){
            int j = 0;
            while(j < powerusage[i].length && !exceeded) {
                usage += powerusage[i][j];
                if (usage > threshold) {
                    exceeded = true;
                }
                j++;
            }
            i++;
        }

        return exceeded;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;
    for(int i = 0; i < usage.length; i++){
        for(int j = 0; j < usage[i].length; j++){
            price += usage[i][j] * prices[i][j];
        }
    }

        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;
        double price = 0;

        for(int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {
                price = usage[i][j] * prices[i][j];
                if(price > 0.9375){
                    support += (price - 0.9375) * 0.9;
                }

                //support += DailyPower.getSupport(usage[i][j], prices[i][j]);
            }
        }

        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;

        // TODO

        return price;
    }
}
