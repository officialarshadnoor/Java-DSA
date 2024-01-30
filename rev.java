import java.util.Scanner;

public class rev {
    public static void main(String[] args) {
        // System.out.println("Hello World!");

        // Scanner s = new Scanner(System.in);
        // System.out.println("Enter a number: ");
        // int a = s.nextInt();
        // System.out.println(a);

        // // Taking name as input
        // Scanner s = new Scanner(System.in);
        // System.out.println("Enter your name: ");
        // String name = s.next();
        // System.out.println(name);

        // Conditions - If & else

        // int salary = 25400;

        // // multiple if else
        // if (salary > 10000) {
        // salary += 2000; // salary = salary + 2000
        // } else if (salary > 20000) {
        // salary += 3000;
        // } else {
        // salary += 1000;
        // }

        // System.out.println(salary);

        // Loop

        // Q - print numbers from 1 to 5

        /*
         * 
         * Syntax for For loop
         * for (initializationl; condition; increament/decreament) {
         * // body
         * }
         */

        // for (int num = 1; num <= 5; num++) {
        // System.out.print(num);
        // }

        // // print numbers from 1 to n
        // Scanner s = new Scanner(System.in);
        // System.out.println("Enter any number: ");
        // int n = s.nextInt();

        // for (int i = 1; i <= n; i++) {
        // System.out.println(i);
        // }

        // // While loop

        // int num = 1;
        // while (num <= 5) {
        // System.out.println(num);
        // num += 1;
        // }

        // // do while loop
        // /*
        // * do {
        // *
        // * } while (condition)
        // * program will execute at least once
        // */

        // int n = 1;
        // do {
        // System.out.println("Hello world ");
        // } while (n != 1);

        // Question - Find the largest of the three numbers

        // Scanner s = new Scanner(System.in);
        // int n1 = s.nextInt();
        // int n2 = s.nextInt();
        // int n3 = s.nextInt();

        // // applying the conditions
        // if (n1 > n2 && n1 > n3) {
        // System.out.println(n1 + " is the greatest number");
        // } else if (n2 > n1 && n2 > n3) {
        // System.out.println(n2 + " is greatest of all");
        // } else {
        // System.out.println(n3 + " is greatest of all three");
        // }

        // // another method for the same

        // int max = n1;
        // if (n2 > max) {
        // max = n2;
        // } else if (n3 > max) {
        // max = n3;
        // }

        // System.out.println("Max value is : " + max);

        // // Que - Fibonacci Number

        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();
        // int p = 0;
        // int i = 1;
        // int count = 2;

        // while (count <= n) {
        // int temp = i;
        // i = i + p;
        // p = temp;
        // count++;
        // }
        // System.out.println(i);

        // // n = 1,3,8,,7,8,9
        // // Find how many times num 3 occurs

        // int n = 455356;
        // int count = 0;
        // while (n > 0) {
        // int rem = n % 10;
        // if (rem == 5) {
        // count++;
        // }
        // n = n / 10;
        // }
        // System.out.println(count);

        // // reverse a number

        // int num = 28479;

        // int ans = 0;

        // while (num > 0) {
        // int rem = num % 10;
        // num /= 10;

        // ans = ans * 10 + rem;
        // }

        // System.out.println(ans);

        // calculator

        /*
         * First we'll take input from the user untill user does not press X or x
         *
         */

        // Scanner s = new Scanner(System.in);

        // while (true) {
        // // take the operator as input
        // System.out.println("Enter any operator (or x to exit) ");
        // char op = s.next().trim().charAt(0);
        // int ans = 0;
        // if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
        // // input two numbers
        // System.out.println("Enter two numbers: ");
        // int num1 = s.nextInt();
        // int num2 = s.nextInt();

        // if (op == '+')
        // ans = num1 + num2;
        // else if (op == '-')
        // ans = num1 - num2;
        // else if (op == '*')
        // ans = num1 * num2;
        // else if (op == '/') {
        // if (num2 != 0)
        // ans = num1 / num2;
        // } else if (op == '%')
        // ans = num1 % num2;
        // } else if (op == 'x' || op == 'X') {
        // break;
        // } else {
        // System.out.println("Invalid operation");
        // }
        // System.out.println(ans);
        // }

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a fruit name: ");
        String fruit = s.next();

        // if (fruit.equals("mango")) {
        // System.out.println("King of fruit");
        // } else if (fruit.equals("apple")) {
        // System.out.println("a sweet red fruit");
        // } else if (fruit.equals("orange")) {
        // System.out.println("A sour fruit");
        // }

        // now we will use switch conditions
        switch (fruit) {
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Orange":
                System.out.println("A sour fruit for juice");
                break;
            default:
                System.out.println("Please enter a valid fruit name!!");
        }

    }

}
