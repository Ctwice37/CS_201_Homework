package lab_7;

public class perfectNumber {

    public static void PerfectNumbers(int lowerBound, int upperBound) {
        String properDivisors = "";
        int sum = 0;
        int perfect = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
           properDivisors = "";
           sum = 0;
            for (int j = i - 1; j >= 1; j--) {
                if (i % j == 0) {
                    sum += j;
                    properDivisors += Integer.toString(j);
                    properDivisors += " ";
                }


                if (i == sum && j == 1) {
                    System.out.println(i + " is perfect.");
                    perfect++;
                    String temp = "";
                    System.out.println("Proper Divisors:");
                    for (int z = properDivisors.length() - 1; z >= 0; z--) {
                        if (properDivisors.charAt(z) != ' ')
                            temp += properDivisors.charAt(z);
                        System.out.print(temp + " ");
                        temp = "";

                    }
                    System.out.println(" = " + i +"\n");

                }else continue;
            }

        }
        System.out.println("There were a total of " + perfect + " perfect number(s)\n" +
                "is the range" + " [" + lowerBound +", "+ upperBound + "]");

    }
        public static void main(String[] args){
            PerfectNumbers(1,1000);

        }
    }

