package lab_10;


import javax.swing.*;
import java.time.DayOfWeek;
import java.util.Random;

public class yearTemps {
    public static void main(String[] args) {

        Random random = new Random();

        double hottestTemp = 0.0;
        double coldestTemp = 0.0;
        int hottestDay = 0;
        int coldestDay = 0;
        String hottest = "";                     //for printing string format
        String coldest = "";                     //for printing string format
        double avgTemp = 0.0;
        int first_of_the_Month = 0;
        int monthCount = 0;
        int z = 0;

        String[] months = {"January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November", "December"};
        int[] lastDayOfMonth = {30, 58, 89, 119, 150, 180, 211, 243, 273, 303, 333, 364};  // last (day - 1) of each month
        double[] monthAverageTemp = new double[12];


        double[] temps = new double[365];                              //initializes array
        for (int i = 0; i < 365; i++) {                             //attempts to create "reasonable" for seasons
            if (i >= 333 || i < 58)
                temps[i] = random.nextInt(15) + -15;
            else if (i >= 58 && i < 333)
                temps[i] = random.nextInt(30) + 10;

        }


        for (int i = 0; i < 365; i++) {
            avgTemp += temps[i];

            if (temps[i] > hottestTemp) {
                hottestTemp = temps[i];
                hottestDay = i;

            } else if (temps[i] < coldestTemp) {
                coldestTemp = temps[i];
                coldestDay = i;
            }

            if (i == lastDayOfMonth[monthCount]) {
                avgTemp = avgTemp / (i - first_of_the_Month);
                monthAverageTemp[monthCount] = avgTemp;
                monthCount++;
                avgTemp = 0.0;
                first_of_the_Month = i;
            }

        }
        for (int i = 0; i < lastDayOfMonth.length; i++) {
            if (hottestDay <= lastDayOfMonth[i]) {
                hottest = months[i];

            } else if (coldestDay <= lastDayOfMonth[i]){
                coldest = months[i];

            }
        }

        if (hottestDay > 30){                                           //mod % method on day ; takes day-of-year
        boolean x = false;                                              //converts to day-of-month
        int y = 0;
            while(x != true){
                if (hottestDay - lastDayOfMonth[y] <30)
                    x = true;
                    hottestDay = hottestDay - lastDayOfMonth[y];
                           }y++;

        }

        System.out.println("Hottest day was " + hottest + " " + (hottestDay + 1));
        System.out.println("\nColdest day was " + coldest + " " + (coldestDay + 1) + "\n\n");
        for (int i = 0; i < 12; i++) {
            System.out.println("Average Temperature in " + months[i] + " = " + monthAverageTemp[i] + "\n");

        }

    }
}