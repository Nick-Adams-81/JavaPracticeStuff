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

        // for loop
        for(int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }

        // array with enhanced for loop
        int[] nums = {1, 2, 3, 4};
        for(int n : nums) {
            System.out.println(n);
        }

        // two-dimensional array
        int [][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(matrix[1][0]);
        System.out.println(matrix[2][2]);

    }
}
