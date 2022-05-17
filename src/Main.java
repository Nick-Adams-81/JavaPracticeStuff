import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;


public class Main {


    public static int add(int a, int b) {
        return a + b;
    }

    public static String stripVowels(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    public static String revString(String str) {
        String string = "";
        char ch;
        for(int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            string = ch + string;
        }
        return string;
    }

    public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(revString(str));
    }

    public static int fibonachi(int n) {
        int a = 0;
        int b = 1;
        for(int i = 0; i < n; i++) {
            int x = a;
            a = b;
            b = b + x;
        }

        return a;
    }

    public static void fizzBuzz(int n) {
        for(int i = 1; i <= n; i++) {
            if(i % 15 == 0) System.out.println("FizzBuzz");
            else if(i % 3 == 0) System.out.println("Fizz");
            else if(i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }
    static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return "no";
                } else {
                    char pop_val = stack.pop();
                    if(s.charAt(i) == ')' && pop_val != '(') {
                        return "no";
                    } else if(s.charAt(i) == '}' && pop_val != '{') {
                        return "no";
                    } else if(s.charAt(i) == ']' && pop_val != '[') {
                        return "no";
                    }
                }
            }
        }

        if(stack.isEmpty()) {
            return "yes";
        } else {
            return "no";
        }
    }



    static void getNumOfMovies() throws IOException {
        URLConnection connection = new URL("https://jsonmock.hackerrank.com/api/moviesdata/search/?Title=substr").openConnection();

        InputStream is = connection.getInputStream();
        System.out.println(connection.getContentType());
        System.out.println(is.read());
    }





    public static void main(String[] args) throws IOException {
        System.out.println(isBalanced("[{})]"));
        getNumOfMovies();
//        System.out.println(add(2, 5));
//        for(int i = 0; i < 10; i++) {
//            System.out.println(fibonachi(i));
//        }
//        System.out.println(revString("hello world"));
//        System.out.println(stripVowels("HEllo WOrld"));
//        System.out.println(isPalindrome("bobby"));
//        fizzBuzz(50);
//
//        // arrays
//        double[] prices;
//        prices = new double[4];
//        prices[0] = 12.25;
//        prices[1] = 11.12;
//        prices[2] = 23.79;
//        prices[3] = 8.24;
//
//        // for loop
//        for(int i = 0; i < prices.length; i++) {
//            System.out.println(prices[i]);
//        }
//
//        // array with enhanced for loop
//        int[] nums = {1, 2, 3, 4};
//        for(int n : nums) {
//            System.out.println(n);
//        }
//
//        // two-dimensional array
//        int [][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        System.out.println(matrix[1][0]);
//        System.out.println(matrix[2][2]);
//
//        String[] names = {"nick", "dave", "john", "george"};
//        for (String name : names) {
//            System.out.println(name);
//        }
//
//        // array lists
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(1, 3);
//        numbers.add(2);
//
//        for(int i = 0; i < numbers.size(); i++) {
//            System.out.println(numbers.get(i));
//        }






    }
}
