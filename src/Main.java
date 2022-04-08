import java.util.ArrayList;
import java.util.Arrays;



public class Main {


    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(2, 5));
        // arrays
        double[] prices;
        prices = new double[4];
        prices[0] = 12.25;
        prices[1] = 11.12;
        prices[2] = 23.79;
        prices[3] = 8.24;

        for(int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }

    }
}
