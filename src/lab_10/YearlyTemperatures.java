package lab_10;

public class YearlyTemperatures {
    static double hottestTempYear = 0;
    static double coldestTempYear = 0;

    static double hottestTempMonth = 0;
    static double coldestTempMonth = 0;


    static String[] months = {"January", "February", "March", "April", "May",
            "June", "July", "August", "September", "October", "November", "December"};
    static int[] monthLength = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static double[] avgMonthTemp = new double[12];
    static double[] TempsYearly = new double[365];


    public static void main(String[] args) {
        for (int i = 0; i < TempsYearly.length; i++) {
            TempsYearly[i] = -5;

        }
        double [] temps = AvgTempMonth(TempsYearly);
            for(double month : TempsYearly)
                System.out.println(month);


        }
        public static void hottestColdestDayYear(double[] temperatures){
            for (int i = 0; i < temperatures.length; i++) {
                if (hottestTempMonth < temperatures[i])
                    hottestTempMonth = temperatures[i];
                else if (coldestTempMonth > temperatures[i])
                    coldestTempMonth = temperatures[i];
            }
            System.out.println(hottestTempMonth);
            System.out.println(coldestTempMonth);

        }

        public static double [] AvgTempMonth(double [] temperatures){
        double sum = 0;
        double average = 0;
        int start_date = 0;
        int addDays = 0;
            for (int i = 0; i < monthLength.length; i++) {
                start_date += addDays;
                sum = 0;
                average = 0;
                for (int j = start_date; j < monthLength[i]; j++) {
                    sum +=temperatures[j];


                }average = sum / monthLength[i];
                avgMonthTemp[i] = average;
                start_date += monthLength[i];


            } return avgMonthTemp;
        }
}
