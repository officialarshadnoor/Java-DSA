package Shraddha;

public class binarySearch {
    // prerequisite - arrays must be sorted

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 10;

        System.out.println("index for key is : " + binarySearch(numbers, key));

    }

    // reversing an array
    public static void reverse(int numbers[]) {
        int first = 0, last = numbers.length - 1;

        while (first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    // // binary search

    // public static int binarySearch(int numbers[], int key) {
    // int start = 0, end = numbers.length - 1;

    // while (start <= end) {
    // int mid = (start + end) / 2;

    // // comparisions
    // if (numbers[mid] == key) {
    // return mid;
    // }
    // // less than key
    // if (numbers[mid] < key) { // right
    // start = mid + 1;
    // } else {
    // end = mid - 1;
    // }
    // }
    // return -1;
    // }

    // binary search practice

    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            // calculate mid point
            int mid = (start + end) / 2;

            // if mid value is equal to key
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
