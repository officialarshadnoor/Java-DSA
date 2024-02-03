package Shraddha;

import java.util.*;

public class prog1 {
    // print reverse of a number
    public static void main(String[] args) {

        // int n = 10899;
        // int num = 0;
        // while (n > 0) {
        // int lastDigit = n % 10;
        // num = num * 10 + lastDigit;
        // n = n / 10;
        // }
        // System.out.println(num);

        // Display all numbers entered by user except multiples of 10
        // Scanner s = new Scanner(System.in);

        // do {
        // System.out.println("Enter your number: ");
        // int n = s.nextInt();
        // if (n % 10 == 0) {
        // continue;
        // }
        // System.out.println("Number was " + n);
        // } while (true);

        // Check if a number is prime or not

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if (n == 2) {
            System.out.println("n is prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i < n * .5; i++) { // we optimised it we can run loop untill root of n
                if (n % i == 0) {
                    isPrime = false;
                }
            }

            if (isPrime == true) {
                System.out.println(n + " is prime number");
            } else {
                System.out.println(n + " is not prime");
            }
        }
    }
}
