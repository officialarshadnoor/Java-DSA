import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        // // taking input from user
        // Scanner s = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int n = s.nextInt();

        // // condition for checking number is even or odd
        // if (n % 2 == 0)
        // System.out.println("Even");
        // if (n % 2 != 0)
        // System.out.println("Odd");/

        // // using else
        // if (n % 2 == 0)
        // System.out.println("Even");
        // else {
        // System.out.println("Odd");
        // }

        // // Que - take integer input and print the absolute value that integer

        // // 1 - Taking the input
        // Scanner s = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int n = s.nextInt();

        // // printing the absolute value
        // if (n > 0) {
        // System.out.println(n);
        // } else {
        // System.out.println(-n);
        // }

        // Que - if cost price and selling price of an item is input the keyboard,
        // write a program to determine whether the seller has made profit or incurred
        // loss or not profit no loss
        // Also determine how much profit he made or loss he incurred!

        // let's start
        // taking inputs from user
        Scanner s = new Scanner(System.in);
        System.out.println("Enter purchase price: ");
        int cp = s.nextInt();
        System.out.println("Enter selling price: ");
        int sp = s.nextInt();

        if (sp > cp)
            System.out.println("Profit: " + (sp - cp));
        else if (cp > sp)
            System.out.println("Loss: " + (cp - sp));
        else
            System.out.println("No profit, No loss");

    }

}
