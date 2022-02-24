public class Main {


    static void FizzBuzz() {
        for (int i = 1; i <= 50; i++)  {
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if(i % 3 == 0) System.out.println("Fizz");
            else if(i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }

    static int Fibonachi(int a) {
        int y = 0;
        int z = 1;
        for(int i = 0; i < a; i++) {
            int x = y;
            y = z;
            z = z + x;
        }
        return y;
    }

    static void ReverseString(String str) {
        String revString = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            revString = ch + revString;
        }

        System.out.println("Reversed String: " + revString);
    }


    public static void main(String[] args) {
        FizzBuzz();
        ReverseString("hello");
        for(int i = 0; i <= 10; i++) {
            System.out.println(Fibonachi(i));
        }
    }
}
