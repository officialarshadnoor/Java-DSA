import java.util.Arrays;
import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        // random();

        // fun(3, 5, 4, 7, 6, 8, 9, 5, 78);

        // multiple(2, 5, "Hello", "Rahul", "Avinash");

        // fun(15);
        // fun("Arshad");

        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();

        // if (isPrime(n)) {
        // System.out.println("Prime number");
        // } else {
        // System.out.println("Not prime number");
        // }
        if (isArms(370)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    // avriable length arguments
    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String... v) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }

    static void random() {
        int num = 67;
        System.out.println(num);
    }

    /*
     * -------Function overloading -----------
     * Function with same name is allowed if parameters are different
     */
    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }

    // checking armstrong number
    /*
     * If sum of cube of all indevidual no's is same then it will be armstrong no
     * 
     */

    static boolean isArms(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            sum = sum + rem * rem * rem;
        }

        return sum == original;
    }

}
