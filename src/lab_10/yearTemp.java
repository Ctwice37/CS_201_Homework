//package lab_10;
//
//import java.util.Random;
//
//public class yearTemp {
//    public static void main(String[] args) {
//        Random random = new Random();
//
//
//        String[] months = {"January", "February", "March", "April", "May",
//                "June", "July", "August", "September", "October", "November", "December"};
//        int[] monthLength = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//         double[] dailyTemp = new double[365];
//
//        for (int i = 0; i < 365; i++) {                             //attempts to create "reasonable" for seasons
//            if (i >= 333 || i < 58)
//                dailyTemp[i] = random.nextInt(15) + -15;
//            else if (i >= 58 && i < 333)
//                dailyTemp[i] = random.nextInt(30) + 10;
//
//
//        }
//
//        double [] averages = AvgMonthlyTemp(dailyTemp, monthLength);
//        for (Double temp : averages)
//            System.out.println(temp);
//
//
//
//    }
//            public static void MaxMin_TEMP(double[] temperatures){
//            double min = 0.0;
//            double max = 0.0;
//
//
//            for (int i = 0; i < temperatures.length; i++) {
//                if (temperatures[i] > max)
//                max = temperatures[i];
//            else if (temperatures[i] < min)
//                    min = temperatures[i];
//            }
//            System.out.println("Hottest Day was: " + max +
//                                "\nColdest Day was: " +min);
//
//
//            }
//
//            public static double [] AvgMonthlyTemp(double[] temperatures, int[] monthLength) {
//
//                int startDate = 0;
//                double max = 0.0;
//                double min = 0.0;
//                int sum = 0;
//                double monthAvg = 0.0;
//                double[] averageMonth = new double[12];
//                int[] loopLength = monthLength;
//                int x = 0;
//
//
//                for (int i = 0; i < loopLength.length; i++) {
//                    for (int j = 0; j <= loopLength[i]; j++) {
//                        sum += temperatures[i];
//                        if (temperatures[j] > max)
//                            max = temperatures[j];
//                        else if (temperatures[j] < min)
//                            min = temperatures[j];
//                        x = j;
//                    }
//                    monthAvg = sum / loopLength[i];
//                    averageMonth[i] = monthAvg;
//                    sum = 0;
//                    monthAvg = 0.0;
//                    startDate = x;
//
//
//                }return averageMonth;
//
//
//            }}
//
//
//
//
//
//
//
//
//
//    public static double [] AvgMonthlyTemp(double[] temperatures, int[] monthLength){
//
//        int sum = 0;
//        double average = 0;
//        double [] averageMonth = new double[12];
//        int firstOfMonth = 1;
//        int month = 0;
//
//        for (int i = 29; i < temperatures.length; i++) {
//            if (i + 1 == monthLength[month]) {
//                average = sum / monthLength[month];
//                averageMonth[month] = average;
//                month++;
//                average = 0.0;
//                sum = 0;
//            }
//            sum += temperatures[i];
//
//        } return averageMonth;
//
//
//
//
//
//
//
