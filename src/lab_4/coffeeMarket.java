package lab_4;

import java.text.DecimalFormat;

public class coffeeMarket {
    public static void main(String[] args) {

        coffeeBag c1 = new coffeeBag(5,32);
        c1.display();




    } public static class coffeeBag {
        private static DecimalFormat df2 = new DecimalFormat("#.##");

        final static double PRICE = 5.99;
        final static double TAX_RATE = .0725;
        final static double TAX_RATE_DISPLAY = 7.25;
        private int bagWeight;
        private int numOfBags;

        public coffeeBag(int lbs, int units){
            this.bagWeight = lbs;
            this.numOfBags = units;
        }
        public double totalPrice(){
            return bagWeight * numOfBags * PRICE;
        }
        public double taxedPrice(){
            return totalPrice() + totalPrice() * TAX_RATE;
        }
        public void display(){
            System.out.println("\nNumber of bags sold: " + this.numOfBags +
                                "\nWeight per bag: " + bagWeight + " lb" +
                                "\nPrice per pound: $" +  PRICE +
                                "\nSales tax: " + TAX_RATE_DISPLAY + "%" +
                                "\n\nTotal price: $ " + df2.format(taxedPrice()));
        }

    }
}
