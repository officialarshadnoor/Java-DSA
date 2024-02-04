package Shraddha;

import java.util.*;
import java.lang.Math;

public class nestedloop {
    public static void main(String args[]) {
        // star pattern printing using nested loop
        // for (int line = 1; line <= 4; line++) {
        // for (int star = 1; star <= line; star++) {
        // System.out.print("*");
        // }
        // System.out.println(); // for next line
        // }

        /*
         * First we write for loop for outer
         * Then second loop for inner
         */

        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= 4 - i + 1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Print Half Pyramid pattern
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // // Print character pattern
        // int n = 5;
        // char ch = 'A';

        // // outer loop
        // for (int i = 1; i <= n; i++) {
        // // inner loop
        // for (int j = 1; j <= i; j++) {
        // System.out.print(ch + " ");
        // ch++;
        // }
        // System.out.println();
        // }

        // calculateSum(15, 20);
        // swap(15, 20);

        // int fact = factorial(7);
        // System.out.println(fact);

        // pattern
        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }
        // int n = 3;
        // for (int i = 1; i <= n; i++) {
        // for (int j = n; j >= i; j--) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // prime number or not
        // if (isPrime(2)) {
        // System.out.println("Prime number");
        // } else {
        // System.out.println("Not a prime number");
        // }

        // print prime numbers 1 to 100
        // for (int i = 2; i <= 100; i++) {
        // if (isPrime(i)) {
        // System.out.print(i + " ");
        // }
        // }

        // binToDec(1000);

        // hollow_rectangle(10, 7);

        // half_piramid(7);
        // half_pira(5);
        // floyd_tri(5);
        // zero_one_trin(5);
        // butterfly(4);
        // solid_rhombus(5);
        // hollow_rhombus(5);

        diamond(5);

    }

    // diamond pattern
    public static void diamond(int n) {
        // for 1st half
        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // for diamond
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // for second half
        for (int i = n; i >= 1; i--) {
            // for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // for diamond
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    // hollow rhombus
    public static void hollow_rhombus(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // for stars
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || i == 1 || i == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void solid_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // for space
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // for stars
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void butterfly(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            // for stas
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // spces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // 2nd half
        for (int i = n; i >= 1; i--) {
            // for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // for spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 0 - 1 triangle
    // public static void zero_one_trin(int n) {
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // if ((i + j) % 2 == 0) {
    // System.out.println("1");
    // } else {
    // System.out.println("0");
    // }
    // }
    // System.out.println();
    // }
    // }

    // FLOYD'S Triangle
    public static void floyd_tri(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1 + 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    // inverted half-piramid with numbers
    public static void half_pira(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // inverted and rotated half piramid
    public static void half_piramid(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // hollow rectangle pattern print
    public static void hollow_rectangle(int totRows, int totCols) {
        // for outer loop
        for (int i = 1; i <= totRows; i++) {
            // inner columns
            for (int j = 1; j <= totCols; j++) {
                // cell (i,j)
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    // boundry cells
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // binary to decimal convertor
    public static void binToDec(int binNum) {
        int power = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, power));
            power++;
            lastDigit /= 10;
        }
        System.out.println(decNum);
    }

    // checking is a number is prime or nestedloopp
    public static boolean isPrime(int n) {
        // if n == 2
        if (n == 2) {
            return true;
        }
        boolean isPrime = true;
        for (int i = 2; i <= n * .5; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    // // functions
    // // parameters in functions
    // public static void calculateSum(int num1, int num2) {
    // int sum = num1 + num2;
    // System.out.println(sum);
    // }

    // public static void swap(int a, int b) {
    // int temp = a;
    // a = b;
    // b = temp;

    // System.out.println("a = " + a);
    // System.out.println("b = " + b);
    // }

    // // calculate the factorial of number n
    // public static int factorial(int n) {
    // int f = 1;
    // for (int i = 1; i <= n; i++) {
    // f = f * i;
    // }
    // return f;
    // }
}
