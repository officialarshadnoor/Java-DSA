package Shraddha;

import java.util.Scanner;

public class arrays {
    public static void main(String args[]) {
        // creatijg array
        // int marks[] = new int[50];

        // int numbers[] = { 1, 2, 3 };

        // int moreNumbers[] = { 4, 5, 6 };

        // String fruits[] = { "apple", "mango", "orange" };

        // java.util.Scanner s = new Scanner(System.in);

        // marks[0] = s.nextInt();
        // marks[1] = s.nextInt();
        // marks[2] = s.nextInt();

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // // Linear search
        // int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        // int key = 10;
        // int index = linearSearch(numbers, key);

        // if (index == -1) {
        // System.out.println("Not found");
        // } else {
        // System.out.println("Key is found at index " + index);
        // }

        // // for string linear search
        // String menu[] = { "dosa", "idli", "poha", "lassi", "dahi bada", "biryani" };

        // String key = "biryani";

        // String result = linearSt(menu, key);

        // System.out.println(result);

        int numbers[] = { 1, 5, 8, 3, 45, 6, 76, 89, 98, 67 };
        // System.out.println("Largest number is " + getLargest(numbers));

        // System.out.println("Smallest number is " + getSmallest(numbers));

        // printPairs(numbers);

        // printSubArrays(numbers);

        // maxSubarraySum(numbers);
        // subArrayTry(numbers);

        subArrayTry(numbers);

    }

    // print subarrays

    public static void subArrayTry(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                }
            }
            System.out.println();
        }
    }

    // max sum of sub arrays
    public static void maxSubarraySum(int numbers[]) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    // subarray sub
                    currSum += numbers[k];
                }
            }
            // System.out.println(currSum);
            if (maxSum < currSum) {
                maxSum = currSum;
            }
        }
        System.out.println(maxSum);
    }

    // finding the all sub arrays
    public static void printSubArrays(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    // pairs in array
    public static void printPairs(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + current + "," + numbers[j] + ")");
            }
            System.out.println();
        }
    }

    // for smallest values finding
    public static int getSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }

        return smallest;
    }

    // get largest number in array
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // - infinity

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    // String linear search
    public static String linearSt(String menu[], String key) {
        for (int i = 0; i <= menu.length; i++) {
            if (menu[i] == key) {
                return "Found at " + i;
            }
        }
        return "Not found";
    }

    // linear search functions
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i <= numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

}
